<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\INSURANCE_SAAS\Models;

use AlibabaCloud\Tea\Model;

class GetMktExtresulturlRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'requestId' => 'request_id',
        'projectId' => 'project_id',
        'uploadMktNo' => 'upload_mkt_no',
    ];
    public function validate() {
        Model::validateRequired('requestId', $this->requestId, true);
        Model::validateRequired('projectId', $this->projectId, true);
        Model::validateRequired('uploadMktNo', $this->uploadMktNo, true);
        Model::validateMaxLength('requestId', $this->requestId, 128);
        Model::validateMaxLength('projectId', $this->projectId, 64);
        Model::validateMaxLength('uploadMktNo', $this->uploadMktNo, 64);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
        }
        if (null !== $this->projectId) {
            $res['project_id'] = $this->projectId;
        }
        if (null !== $this->uploadMktNo) {
            $res['upload_mkt_no'] = $this->uploadMktNo;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return GetMktExtresulturlRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['request_id'])){
            $model->requestId = $map['request_id'];
        }
        if(isset($map['project_id'])){
            $model->projectId = $map['project_id'];
        }
        if(isset($map['upload_mkt_no'])){
            $model->uploadMktNo = $map['upload_mkt_no'];
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 请求id，每一次请求保持唯一，若重复，则报错
    /**
     * @var string
     */
    public $requestId;

    // 项目ID，蚂蚁分配
    /**
     * @var string
     */
    public $projectId;

    // 上传营销标识，来源于上传结果通知中的uploadMktNo
    /**
     * @var string
     */
    public $uploadMktNo;

}
