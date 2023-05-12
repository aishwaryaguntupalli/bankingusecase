package com.cognizant.transactionapplication.model.response;

public class transactionserviceresponsemodel {




    private String message;
    private Long transactiontId;



    public transactionserviceresponsemodel(String message) {
        super();
        this.message = message;
        this.transactiontId = transactiontId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}