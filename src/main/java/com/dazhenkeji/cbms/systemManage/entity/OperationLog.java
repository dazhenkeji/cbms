package com.dazhenkeji.cbms.systemManage.entity;

import java.io.Serializable;
import java.util.Date;


public class OperationLog implements Serializable {

    public Integer operationLogSn;

    public String operatorId;

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

    public String getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
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
