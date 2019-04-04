package com.dazhenkeji.cbms.base.model;

import java.util.Date;

/**
 * created by lgl on 2019/4/4 14:02
 **/
public class OperationModel {

    public Integer operationLogSn;

    public String operationId;

    public String operationType;

    public String operationContent;

    public Date operationTime;

    public String operatorIp;

    public String serverIp;

    public String funId;

    public String operationalDivisionId;

    public Integer getOperationLogSn() {
        return operationLogSn;
    }

    public void setOperationLogSn(Integer operationLogSn) {
        this.operationLogSn = operationLogSn;
    }

    public String getOperationId() {
        return operationId;
    }

    public void setOperationId(String operationId) {
        this.operationId = operationId;
    }

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public String getOperationContent() {
        return operationContent;
    }

    public void setOperationContent(String operationContent) {
        this.operationContent = operationContent;
    }

    public Date getOperationTime() {
        return operationTime;
    }

    public void setOperationTime(Date operationTime) {
        this.operationTime = operationTime;
    }

    public String getOperatorIp() {
        return operatorIp;
    }

    public void setOperatorIp(String operatorIp) {
        this.operatorIp = operatorIp;
    }

    public String getServerIp() {
        return serverIp;
    }

    public void setServerIp(String serverIp) {
        this.serverIp = serverIp;
    }

    public String getFunId() {
        return funId;
    }

    public void setFunId(String funId) {
        this.funId = funId;
    }

    public String getOperationalDivisionId() {
        return operationalDivisionId;
    }

    public void setOperationalDivisionId(String operationalDivisionId) {
        this.operationalDivisionId = operationalDivisionId;
    }

}
