package com.example.telnetproject.model;

public class TelnetModel {
    private String host;
    private int port;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    @Override
    public String toString() {
        return "TelnetModel{" +
                "host='" + host + '\'' +
                ", port='" + port + '\'' +
                '}';
    }
}