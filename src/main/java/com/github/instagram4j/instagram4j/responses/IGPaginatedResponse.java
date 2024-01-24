package com.github.instagram4j.instagram4j.responses;

public interface IGPaginatedResponse {
    String getNext_min_id();

    boolean isMore_available();
}
