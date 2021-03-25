<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class UploadApplicationPackageRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'tenant' => 'tenant',
        'applicationName' => 'application_name',
        'packageName' => 'package_name',
        'versionNo' => 'version_no',
        'workspace' => 'workspace',
    ];
    public function validate() {
        Model::validateRequired('applicationName', $this->applicationName, true);
        Model::validateRequired('packageName', $this->packageName, true);
        Model::validateRequired('versionNo', $this->versionNo, true);
        Model::validateRequired('workspace', $this->workspace, true);
        Model::validateMaxLength('packageName', $this->packageName, 100);
        Model::validateMaxLength('versionNo', $this->versionNo, 50);
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
        if (null !== $this->packageName) {
            $res['package_name'] = $this->packageName;
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
     * @return UploadApplicationPackageRequest
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
        if(isset($map['package_name'])){
            $model->packageName = $map['package_name'];
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

    /**
     * @var string
     */
    public $tenant;

    // 目标应用完整名称
    /**
     * @var string
     */
    public $applicationName;

    // 应用发布包名称。长度不超过100个双字节字符
    /**
     * @var string
     */
    public $packageName;

    // 版本号。长度不超过50个单字节字符
    /**
     * @var string
     */
    public $versionNo;

    // 目标工作空间名称
    /**
     * @var string
     */
    public $workspace;

}
