<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class GetApplicationRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'tenant' => 'tenant',
        'applicationName' => 'application_name',
        'queryExtraInfo' => 'query_extra_info',
    ];
    public function validate() {
        Model::validateRequired('applicationName', $this->applicationName, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->tenant) {
            $res['tenant'] = $this->tenant;
        }
        if (null !== $this->applicationName) {
            $res['application_name'] = $this->applicationName;
        }
        if (null !== $this->queryExtraInfo) {
            $res['query_extra_info'] = $this->queryExtraInfo;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return GetApplicationRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['tenant'])){
            $model->tenant = $map['tenant'];
        }
        if(isset($map['application_name'])){
            $model->applicationName = $map['application_name'];
        }
        if(isset($map['query_extra_info'])){
            $model->queryExtraInfo = $map['query_extra_info'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $tenant;

    // 待查询的应用名称。最大60个UTF-8字符
    /**
     * @var string
     */
    public $applicationName;

    // 查询结果是否返回应用额外元数据信息。默认为 false
    /**
     * @var bool
     */
    public $queryExtraInfo;

}
