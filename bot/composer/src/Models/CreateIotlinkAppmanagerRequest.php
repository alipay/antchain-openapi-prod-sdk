<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;
use GuzzleHttp\Psr7\Stream;

class CreateIotlinkAppmanagerRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 应用文件
    /**
     * @description 待上传文件
     *
     * @var Stream
     */
    public $fileObject;

    /**
     * @description 待上传文件名
     *
     * @var string
     */
    public $fileObjectName;

    /**
     * @var string
     */
    public $fileId;

    // 应用模块名称，由查询应用类型列表获取。默认使用default模块
    /**
     * @var string
     */
    public $moduleName;

    // OTA升级包名称，需在iot账号下唯一，创建后不可修改。支持中文、英文字母、日文、数字、短划线（-）、下划线（_）和半角圆括号（()），必须以中文、英文、日文或数字开头，长度限制为1~40个字符。
    /**
     * @var string
     */
    public $apkName;

    // 品类code
    /**
     * @var string
     */
    public $categoryCode;

    // 设备型号值
    /**
     * @var string
     */
    public $deviceModelValue;

    // 应用包描述
    // 最大字符为100
    /**
     * @var string
     */
    public $remark;

    // 当前OTA升级包的版本号，仅支持英文字母、数字、半角句号（.）、短划线（-）和下划线（_）。长度限制为1~64个字符。
    // 最新模块版本好可通过查询应用类型列表接口获取
    /**
     * @var string
     */
    public $apkVersion;

    // 项目编码
    /**
     * @var string
     */
    public $projectCode;

    // 文件地址
    /**
     * @var string
     */
    public $fileUrl;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'fileId'            => 'file_id',
        'moduleName'        => 'module_name',
        'apkName'           => 'apk_name',
        'categoryCode'      => 'category_code',
        'deviceModelValue'  => 'device_model_value',
        'remark'            => 'remark',
        'apkVersion'        => 'apk_version',
        'projectCode'       => 'project_code',
        'fileUrl'           => 'file_url',
    ];

    public function validate()
    {
        Model::validateRequired('apkName', $this->apkName, true);
        Model::validateRequired('categoryCode', $this->categoryCode, true);
        Model::validateRequired('apkVersion', $this->apkVersion, true);
        Model::validateRequired('projectCode', $this->projectCode, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->fileObject) {
            $res['fileObject'] = $this->fileObject;
        }
        if (null !== $this->fileObjectName) {
            $res['fileObjectName'] = $this->fileObjectName;
        }
        if (null !== $this->fileId) {
            $res['file_id'] = $this->fileId;
        }
        if (null !== $this->moduleName) {
            $res['module_name'] = $this->moduleName;
        }
        if (null !== $this->apkName) {
            $res['apk_name'] = $this->apkName;
        }
        if (null !== $this->categoryCode) {
            $res['category_code'] = $this->categoryCode;
        }
        if (null !== $this->deviceModelValue) {
            $res['device_model_value'] = $this->deviceModelValue;
        }
        if (null !== $this->remark) {
            $res['remark'] = $this->remark;
        }
        if (null !== $this->apkVersion) {
            $res['apk_version'] = $this->apkVersion;
        }
        if (null !== $this->projectCode) {
            $res['project_code'] = $this->projectCode;
        }
        if (null !== $this->fileUrl) {
            $res['file_url'] = $this->fileUrl;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateIotlinkAppmanagerRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['fileObject'])) {
            $model->fileObject = $map['fileObject'];
        }
        if (isset($map['fileObjectName'])) {
            $model->fileObjectName = $map['fileObjectName'];
        }
        if (isset($map['file_id'])) {
            $model->fileId = $map['file_id'];
        }
        if (isset($map['module_name'])) {
            $model->moduleName = $map['module_name'];
        }
        if (isset($map['apk_name'])) {
            $model->apkName = $map['apk_name'];
        }
        if (isset($map['category_code'])) {
            $model->categoryCode = $map['category_code'];
        }
        if (isset($map['device_model_value'])) {
            $model->deviceModelValue = $map['device_model_value'];
        }
        if (isset($map['remark'])) {
            $model->remark = $map['remark'];
        }
        if (isset($map['apk_version'])) {
            $model->apkVersion = $map['apk_version'];
        }
        if (isset($map['project_code'])) {
            $model->projectCode = $map['project_code'];
        }
        if (isset($map['file_url'])) {
            $model->fileUrl = $map['file_url'];
        }

        return $model;
    }
}
