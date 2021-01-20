<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class GetApplicationPackageRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'applicationName' => 'application_name',
        'versionNo' => 'version_no',
        'workspace' => 'workspace',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->applicationName) {
            $res['application_name'] = $this->applicationName;
        }
        if (null !== $this->versionNo) {
            $res['version_no'] = $this->versionNo;
        }
        if (null !== $this->workspace) {
            $res['workspace'] = $this->workspace;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return GetApplicationPackageRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['application_name'])){
            $model->applicationName = $map['application_name'];
        }
        if(isset($map['version_no'])){
            $model->versionNo = $map['version_no'];
        }
        if(isset($map['workspace'])){
            $model->workspace = $map['workspace'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    // 发布包所属的应用名称。最大60个UTF-8字符
    /**
     * @var string
     */
    public $applicationName;

    // 版本号。长度不超过50个单字节字符
    /**
     * @var string
     */
    public $versionNo;

    // 环境
    /**
     * @var string
     */
    public $workspace;

}
