## Star War Java Restful APP
This powerful Restful APP allows people on planet to check any landing/invading sharship.

It's running on Java Spring Boot and data are stored in Postgres SQL

## Pre-requisit
You only need Docker installed in your machine, leave the rest to the FORCE

## How to Run
1. Open terminal
2. Go into the root folder (cd ./starwar)
3. Run it using docker compose (docker-compose up)

## How to call the api
1. Look for the name that you wish to check who have registered in the database
   
   There are 2 person who have already registered:dart_vader, leia(who's starship is under maintainance in another planet)
2. Fire http://localhost:8080/information?name={name} on postman, browser or termincal curl
   
   Example: http://localhost:8080/information?name=dart_vader
3. Error will appear if you are looking for a person who is not registered yet
4. Error will appear if you didn't specify name of person

## Output example
```json
{
    "starship": {
        "name": "Planet Destroyer",
        "model": "MK-5",
        "class": "Heavy Duty"
    },
    "crew": 100,
    "isLeiaOnPlanet": false
}
```

## Database Relationship/Design
There are 2 tables appeared in this application
1. Information table, to store overall information:
   - information id (id)
   - starship relevent id(starship_id)
     
     This is bind with 'id' field in starship table, if one doesn't have a starship, leave it empty
   - crew number(crew)
   - Leia's availability (is_leia_on_planet)
   - name of sharship owner(name)

2. Starship table, to store startship information:
   - id (starship id)
   - name of starship(name)
   - class of startship(class)
   - model of startship(model)

## Things to take note
The app and databse is running on default port (8080, 5432)

To prevent any port conflicting, shut down all service using above port

Or change to your desire port in docker-compose.yml
