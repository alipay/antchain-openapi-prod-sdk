<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class SyncreateApplicationVersionRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'applicationName' => 'application_name',
        'packageEtag' => 'package_etag',
        'packageName' => 'package_name',
        'tenant' => 'tenant',
        'versionMemo' => 'version_memo',
        'versionNo' => 'version_no',
        'workspace' => 'workspace',
    ];
    public function validate() {
        Model::validateMaxLength('packageName', $this->packageName, 100);
        Model::validateMaxLength('versionNo', $this->versionNo, 50);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->applicationName) {
            $res['application_name'] = $this->applicationName;
        }
        if (null !== $this->packageEtag) {
            $res['package_etag'] = $this->packageEtag;
        }
        if (null !== $this->packageName) {
            $res['package_name'] = $this->packageName;
        }
        if (null !== $this->tenant) {
            $res['tenant'] = $this->tenant;
        }
        if (null !== $this->versionMemo) {
            $res['version_memo'] = $this->versionMemo;
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
     * @return SyncreateApplicationVersionRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['application_name'])){
            $model->applicationName = $map['application_name'];
        }
        if(isset($map['package_etag'])){
            $model->packageEtag = $map['package_etag'];
        }
        if(isset($map['package_name'])){
            $model->packageName = $map['package_name'];
        }
        if(isset($map['tenant'])){
            $model->tenant = $map['tenant'];
        }
        if(isset($map['version_memo'])){
            $model->versionMemo = $map['version_memo'];
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

    // 目标应用完整名称
    /**
     * @var string
     */
    public $applicationName;

    // 应用部署包文件16字节md5值，以32位十六进制字符表示，不区分大小写。如果提供，将会以此md5值进行校验，检验不通过则认为创建失败
    // 
    /**
     * @var string
     */
    public $packageEtag;

    // 应用发布包名称。长度不超过100个双字节字符
    /**
     * @var string
     */
    public $packageName;

    // 目标租户名称
    /**
     * @var string
     */
    public $tenant;

    // 应用发布包备注
    /**
     * @var string
     */
    public $versionMemo;

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
