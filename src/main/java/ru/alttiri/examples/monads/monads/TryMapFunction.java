package ru.alttiri.examples.monads.monads;


public interface TryMapFunction<T, R> {
    R apply(T t) throws Throwable;
}
