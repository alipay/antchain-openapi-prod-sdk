<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\INSURANCE_SAAS\Models;

use AlibabaCloud\Tea\Model;

class CallbackMktMonitordataRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'requestId' => 'request_id',
        'dataType' => 'data_type',
        'dataContent' => 'data_content',
        'projectId' => 'project_id',
    ];
    public function validate() {
        Model::validateRequired('requestId', $this->requestId, true);
        Model::validateRequired('dataType', $this->dataType, true);
        Model::validateRequired('dataContent', $this->dataContent, true);
        Model::validateRequired('projectId', $this->projectId, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
        }
        if (null !== $this->dataType) {
            $res['data_type'] = $this->dataType;
        }
        if (null !== $this->dataContent) {
            $res['data_content'] = $this->dataContent;
        }
        if (null !== $this->projectId) {
            $res['project_id'] = $this->projectId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CallbackMktMonitordataRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['request_id'])){
            $model->requestId = $map['request_id'];
        }
        if(isset($map['data_type'])){
            $model->dataType = $map['data_type'];
        }
        if(isset($map['data_content'])){
            $model->dataContent = $map['data_content'];
        }
        if(isset($map['project_id'])){
            $model->projectId = $map['project_id'];
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 回传请求对应id
    /**
     * @var string
     */
    public $requestId;

    // 监测数据回传数据类型，仅支持: POLICY_DATA（保单信息）, CANCELLATION_DATA（退保信息）, RENEWAL_DATA（续费信息）
    /**
     * @var string
     */
    public $dataType;

    // 监测数据回传内容
    /**
     * @var string
     */
    public $dataContent;

    // 与待传营销数据相关联的项目id 结合数科网关租户id进行鉴权
    /**
     * @var string
     */
    public $projectId;

}
