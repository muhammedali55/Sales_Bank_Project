package com.muhammet.sales.exceptions;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import static org.springframework.http.HttpStatus.*;


@AllArgsConstructor
@NoArgsConstructor
@Getter
public enum ErrorType {

    INTERNAL_ERROR(2000, "Internal Server Error", INTERNAL_SERVER_ERROR),
    BAD_REQUEST_ERROR(2001, "Invalid Parameter Error", BAD_REQUEST),
    RATE_PLAN_FOR_SAVE_INTERNAL_SERVER(2002,
            "RatePlan Service  has internal server error for save ratePlan", INTERNAL_SERVER_ERROR),
    TRANSACTIONAL_LIMIT_FOR_SAVE_INTERNAL_SERVER(2003,
            "TransactionalLimit Service  has internal server error for save transactionalLimit",
            INTERNAL_SERVER_ERROR),
    INTEREST_PLAN_FOR_SAVE_INTERNAL_SERVER(2004,
            "InterestPlan Service  has internal server error for save interestPlan",
            INTERNAL_SERVER_ERROR),
    ACCOUNT_FOR_SAVE_INTERNAL_SERVER(2004,
            "Account Service  has internal server error for save account", INTERNAL_SERVER_ERROR),
    LOAN_FOR_SAVE_INTERNAL_SERVER(2005, "Account Service  has internal server error for save loan",
            INTERNAL_SERVER_ERROR),
    PRODUCTS_FOR_GET_ALL_PRODUCTS_NOT_FOUND(2006, "Product Service has no products for Get Products",
            NOT_FOUND),
    PRODUCT_FOR_PRODUCT_BY_KEY_PRODUCTS_NOT_FOUND(2007,
            "Product Service has no products for Get Product by ProductKey", NOT_FOUND),
    INTEREST_PLANS_GET_LIST_NOT_FOUND(2008,
            "InterestPlan Service  has no interest plan list for get interest plan list", NOT_FOUND),
    TRANSACTIONAL_LIMIT_FOR_SAVE_BAD_REQUEST(2009,
            "TransactionalLimit Service - request include exist limits", BAD_REQUEST),
    TRANSACTIONAL_LIMIT_FOR_GET_NOT_FOUND(2010,
            "TransactionalLimit Service - there is no any transactionalLimits", NOT_FOUND),
    RATE_PLAN_TABLE_SAVING_ERROR(2011, "An error occurred when saving data to the rate plan table.",
            BAD_REQUEST),

    TRANSACTIONAL_LIMIT_SAVE_FOR_LOAN_VALIDATE_ERROR(2012,
            "You can't save transactional limits for loan ",
            BAD_REQUEST),

    TRANSACTIONAL_LIMIT_SAVE_FOR_COMMON_NOT_EMPTY_PRODUCT_KEY_VALIDATE_ERROR(2013,
            "You can't save transactional limits as a common with productKey",
            BAD_REQUEST),

    TRANSACTIONAL_LIMIT_SAVE_FOR_WITHDRAWAL_PAYMENT_LIMIT_AND_EMPTY_VALUE_VALIDATE_ERROR(2014,
            "You can't save transactional limits includes withdrawal_payment_limit with empty value withdrawal_payment_limit",
            BAD_REQUEST),

    TRANSACTIONAL_LIMIT_SAVE_FOR_EMPTY_VALUE_AND_QUANTITY_VALIDATE_ERROR(2015,
            "You can't save transactional limits with empty value and quantity",
            BAD_REQUEST),
    CHARGES_FEE_TABLE_SAVING_ERROR(2016,
            "An error occurred when saving data to the charges_fee table.",
            BAD_REQUEST),
    CHARGES_FEE_GET_LIST_NOT_FOUND(2017,
            "Charges Fee Service  has no charges fee list by product key", NOT_FOUND),
    REQUESTED_CURRENCY_DOES_NOT_MATCH_WITH_PRODUCT(2018,
            "Requested currency does not match with product.", BAD_REQUEST),

    TRANSACTIONAL_LIMIT_SAVE_FOR_PRODUCT_EMPTY_PRODUCT_KEY_VALIDATE_ERROR(2019,
            "You can't save transactional limits as a product without productKey",
            BAD_REQUEST),
    SERVICES_FEE_NOT_FOUND_FOR_THIS_SERVICES_FEE_KEY(2020,
            "No services fee found for services fee key.", NOT_FOUND),
    INTEREST_PLAN_SERVICES_FEE_RELATION_TABLE_SAVING_ERROR(2021,
            "An error occurred when saving data to the interest plan services fee relation table.",
            BAD_REQUEST),
    INTEREST_PLAN_NOT_FOUND_FOR_THIS_INTEREST_PLAN_KEY(2022,
            "No interest plan found for interest plan key.", NOT_FOUND),
    SERVICES_FEE_NOT_FOUND_FOR_THIS_INTEREST_PLAN_KEY(2023,
            "No services fee found for interest plan key.", NOT_FOUND),
    INVALID_CURRENCY_FOR_SERVICE_FEE(2024, "Invalid currency for service fee.", BAD_REQUEST),
    INVALID_INTEREST_TYPE(2025, "Invalid interest type", BAD_REQUEST),
    CURRENCY_TYPES_DID_NOT_MATCH(2025, "Currency types did not match", BAD_REQUEST);


    private int code;
    private String message;
    private HttpStatus httpStatus;
}