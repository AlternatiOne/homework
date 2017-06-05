package ru.alttiri.Trash.monads.monads;


public interface TryMapFunction<T, R> {
    R apply(T t) throws Throwable;
}
