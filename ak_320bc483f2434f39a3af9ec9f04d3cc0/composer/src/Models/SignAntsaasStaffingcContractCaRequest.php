<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_320bc483f2434f39a3af9ec9f04d3cc0\Models;

use AlibabaCloud\Tea\Model;
use GuzzleHttp\Psr7\Stream;

class SignAntsaasStaffingcContractCaRequest extends Model
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

    // 业务名称
    /**
     * @var string
     */
    public $bizName;

    // 业务编号
    /**
     * @var string
     */
    public $bizNo;

    // 版本
    /**
     * @var string
     */
    public $signVersion;

    // 签署任务信息
    /**
     * @var CaSignTaskRequest[]
     */
    public $signTaskRequestList;

    // 通过文件API上传的文件的file_id
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

    // 合同模板密钥:若为合同模板该值必填,否则不需要填写
    /**
     * @var string
     */
    public $templateSecretKey;

    // 模板填充字段集合
    /**
     * @var TemplateFieldConfigRequest[]
     */
    public $templateFieldConfigRequestList;
    protected $_name = [
        'authToken'                      => 'auth_token',
        'productInstanceId'              => 'product_instance_id',
        'bizName'                        => 'biz_name',
        'bizNo'                          => 'biz_no',
        'signVersion'                    => 'sign_version',
        'signTaskRequestList'            => 'sign_task_request_list',
        'fileId'                         => 'file_id',
        'templateSecretKey'              => 'template_secret_key',
        'templateFieldConfigRequestList' => 'template_field_config_request_list',
    ];

    public function validate()
    {
        Model::validateRequired('bizName', $this->bizName, true);
        Model::validateRequired('bizNo', $this->bizNo, true);
        Model::validateRequired('signVersion', $this->signVersion, true);
        Model::validateRequired('signTaskRequestList', $this->signTaskRequestList, true);
        Model::validateRequired('fileId', $this->fileId, true);
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
        if (null !== $this->bizName) {
            $res['biz_name'] = $this->bizName;
        }
        if (null !== $this->bizNo) {
            $res['biz_no'] = $this->bizNo;
        }
        if (null !== $this->signVersion) {
            $res['sign_version'] = $this->signVersion;
        }
        if (null !== $this->signTaskRequestList) {
            $res['sign_task_request_list'] = [];
            if (null !== $this->signTaskRequestList && \is_array($this->signTaskRequestList)) {
                $n = 0;
                foreach ($this->signTaskRequestList as $item) {
                    $res['sign_task_request_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
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
        if (null !== $this->templateSecretKey) {
            $res['template_secret_key'] = $this->templateSecretKey;
        }
        if (null !== $this->templateFieldConfigRequestList) {
            $res['template_field_config_request_list'] = [];
            if (null !== $this->templateFieldConfigRequestList && \is_array($this->templateFieldConfigRequestList)) {
                $n = 0;
                foreach ($this->templateFieldConfigRequestList as $item) {
                    $res['template_field_config_request_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SignAntsaasStaffingcContractCaRequest
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
        if (isset($map['biz_name'])) {
            $model->bizName = $map['biz_name'];
        }
        if (isset($map['biz_no'])) {
            $model->bizNo = $map['biz_no'];
        }
        if (isset($map['sign_version'])) {
            $model->signVersion = $map['sign_version'];
        }
        if (isset($map['sign_task_request_list'])) {
            if (!empty($map['sign_task_request_list'])) {
                $model->signTaskRequestList = [];
                $n                          = 0;
                foreach ($map['sign_task_request_list'] as $item) {
                    $model->signTaskRequestList[$n++] = null !== $item ? CaSignTaskRequest::fromMap($item) : $item;
                }
            }
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
        if (isset($map['template_secret_key'])) {
            $model->templateSecretKey = $map['template_secret_key'];
        }
        if (isset($map['template_field_config_request_list'])) {
            if (!empty($map['template_field_config_request_list'])) {
                $model->templateFieldConfigRequestList = [];
                $n                                     = 0;
                foreach ($map['template_field_config_request_list'] as $item) {
                    $model->templateFieldConfigRequestList[$n++] = null !== $item ? TemplateFieldConfigRequest::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
