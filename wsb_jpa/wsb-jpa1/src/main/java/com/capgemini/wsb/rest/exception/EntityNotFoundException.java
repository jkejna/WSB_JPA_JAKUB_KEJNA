package com.capgemini.wsb.rest.exception;

public class EntityNotFoundException extends RuntimeException
{

    public EntityNotFoundException(Long id)
    {
        super("Could not find entity of id " + id);
    }

    public EntityNotFoundException(String nazwisko)
    {
        super("Could not find entity of surname " + nazwisko);
    }

    public EntityNotFoundException(int id)
    {
        super("Could not find entity with count of " + id);
    }

    public EntityNotFoundException(double wzrost)
    {
        super("Could not find entity of height " + wzrost);
    }
}
