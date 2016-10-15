package ru.gdgkazan.rxjavasamples.tasks;

import android.support.annotation.NonNull;

import rx.Observable;
import rx.functions.Func1;

/**
 * @author Artur Vasilov
 */
public class RxJavaTask2 {

    /**
     * TODO:
     * <p>
     * Method takes observable of strings as a parameter
     * <p>
     * Supply all elements until you meet word END in the stream (END word should be excluded)
     * After that remove all repeated values from the stream
     */
    @NonNull
    public static Observable<String> task2(@NonNull Observable<String> observable) {
        return observable
                .takeUntil(s -> {
                    return s.contains("END");
                }).filter(s -> !s.contains("END"))
                .distinct();
    }

}
