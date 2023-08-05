--
-- PostgreSQL database dump
--

-- Dumped from database version 15.3 (Debian 15.3-1.pgdg120+1)
-- Dumped by pg_dump version 15.3 (Debian 15.3-1.pgdg120+1)

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- Name: information; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.information (
    id integer NOT NULL,
    starship_id bigint,
    crew bigint,
    is_leia_on_planet boolean,
    name character varying(255)
);


ALTER TABLE public.information OWNER TO postgres;

--
-- Name: information_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.information_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.information_id_seq OWNER TO postgres;

--
-- Name: information_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.information_id_seq OWNED BY public.information.id;


--
-- Name: starship; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.starship (
    id integer NOT NULL,
    name character varying(255),
    class character varying(255),
    model character varying(255)
);


ALTER TABLE public.starship OWNER TO postgres;

--
-- Name: starship_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.starship_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.starship_id_seq OWNER TO postgres;

--
-- Name: starship_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.starship_id_seq OWNED BY public.starship.id;


--
-- Name: information id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.information ALTER COLUMN id SET DEFAULT nextval('public.information_id_seq'::regclass);


--
-- Name: starship id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.starship ALTER COLUMN id SET DEFAULT nextval('public.starship_id_seq'::regclass);


--
-- Data for Name: information; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.information (id, starship_id, crew, is_leia_on_planet, name) FROM stdin;
1	1	100	f	dart_vader
2	\N	0	t	leia
\.


--
-- Data for Name: starship; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.starship (id, name, class, model) FROM stdin;
1	Planet Destroyer	Heavy Duty	MK-5
\.


--
-- Name: information_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.information_id_seq', 2, true);


--
-- Name: starship_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.starship_id_seq', 1, true);


--
-- Name: information information_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.information
    ADD CONSTRAINT information_pkey PRIMARY KEY (id);


--
-- Name: starship starship_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.starship
    ADD CONSTRAINT starship_pkey PRIMARY KEY (id);


--
-- PostgreSQL database dump complete
--