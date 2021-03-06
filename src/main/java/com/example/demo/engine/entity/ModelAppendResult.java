package com.example.demo.engine.entity;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.engine.util.AttributeCheck;

public class ModelAppendResult {
    private String modelListCheckStatus;
    private String modelListPath;
    private List<ModelAppendInfo> modelAppendInfoList;
    private Integer appendPassCount;
    private Integer appendFailCount;
    private Integer totalFaceCount;
    // programe control
    private boolean appendCmdSuccess = true;
    // init func
    private AttributeCheck attributeCheck;

    public String getModelListCheckStatus() {
        return modelListCheckStatus;
    }
    public void setModelListCheckStatus(String modelListCheckStatus) {
        this.modelListCheckStatus = modelListCheckStatus;
    }
    public String getModelListPath() {
        return modelListPath;
    }
    public void setModelListPath(String modelListPath) {
        this.modelListPath = modelListPath;
    }
    public List<ModelAppendInfo> getModelAppendInfoList() {
        if(attributeCheck==null){
            attributeCheck = new AttributeCheck();
        }
        if(!attributeCheck.listNotEmpty(modelAppendInfoList)){
            modelAppendInfoList = new ArrayList<>();
        }
        return modelAppendInfoList;
    }
    public void setModelAppendInfoList(List<ModelAppendInfo> modelAppendInfoList) {
        this.modelAppendInfoList = modelAppendInfoList;
    }
    public Integer getAppendPassCount() {
        return appendPassCount;
    }
    public void setAppendPassCount(Integer appendPassCount) {
        this.appendPassCount = appendPassCount;
    }
    public Integer getAppendFailCount() {
        return appendFailCount;
    }
    public void setAppendFailCount(Integer appendFailCount) {
        this.appendFailCount = appendFailCount;
    }
    public boolean isAppendCmdSuccess() {
        return appendCmdSuccess;
    }
    public void setAppendCmdSuccess(boolean appendCmdSuccess) {
        this.appendCmdSuccess = appendCmdSuccess;
    }
    public Integer getTotalFaceCount() {
        return totalFaceCount;
    }
    public void setTotalFaceCount(Integer totalFaceCount) {
        this.totalFaceCount = totalFaceCount;
    }
}
