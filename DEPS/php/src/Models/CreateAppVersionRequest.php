<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class CreateAppVersionRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'applicationName' => 'application_name',
        'fileMd5' => 'file_md5',
        'filePath' => 'file_path',
        'fileSize' => 'file_size',
        'fileSource' => 'file_source',
        'tenant' => 'tenant',
        'versionMemo' => 'version_memo',
        'versionNo' => 'version_no',
        'workspace' => 'workspace',
    ];
    public function validate() {
        Model::validateMaxLength('filePath', $this->filePath, 1024);
        Model::validateMaxLength('versionMemo', $this->versionMemo, 100);
        Model::validateMaxLength('versionNo', $this->versionNo, 50);
        Model::validateMaximum('fileSize', $this->fileSize, '524288000');
        Model::validateMinimum('fileSize', $this->fileSize, '1');
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->applicationName) {
            $res['application_name'] = $this->applicationName;
        }
        if (null !== $this->fileMd5) {
            $res['file_md5'] = $this->fileMd5;
        }
        if (null !== $this->filePath) {
            $res['file_path'] = $this->filePath;
        }
        if (null !== $this->fileSize) {
            $res['file_size'] = $this->fileSize;
        }
        if (null !== $this->fileSource) {
            $res['file_source'] = $this->fileSource;
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
     * @return CreateAppVersionRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['application_name'])){
            $model->applicationName = $map['application_name'];
        }
        if(isset($map['file_md5'])){
            $model->fileMd5 = $map['file_md5'];
        }
        if(isset($map['file_path'])){
            $model->filePath = $map['file_path'];
        }
        if(isset($map['file_size'])){
            $model->fileSize = $map['file_size'];
        }
        if(isset($map['file_source'])){
            $model->fileSource = $map['file_source'];
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

    // 应用部署包文件16字节md5值，以32位十六进制字符表示，不区分大小写。如果提供，APPMS下载应用部署包完成后，将会以此md5值进行校验，检验不通过则认为下载失败
    // 
    /**
     * @var string
     */
    public $fileMd5;

    // 应用部署包文件路径。长度不超过1024个单字节字符
    /**
     * @var string
     */
    public $filePath;

    // 应用部署包文件大小，单位字节。取值范围[1,524288000]，即最大支持500M, 524288000 = 500 x 1024 x 1024
    // 
    /**
     * @var int
     */
    public $fileSize;

    // 文件交换源id
    /**
     * @var string
     */
    public $fileSource;

    // 目标租户名称
    /**
     * @var string
     */
    public $tenant;

    // 版本备注。长度不超过100个双字节字符
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
