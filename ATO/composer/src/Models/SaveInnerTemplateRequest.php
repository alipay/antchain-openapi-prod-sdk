<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class SaveInnerTemplateRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'tenantId' => 'tenant_id',
        'templateCode' => 'template_code',
        'templateVersion' => 'template_version',
        'previewAddress' => 'preview_address',
        'templateElementList' => 'template_element_list',
        'fileKey' => 'file_key',
        'confirm' => 'confirm',
    ];
    public function validate() {
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('templateCode', $this->templateCode, true);
        Model::validateRequired('templateVersion', $this->templateVersion, true);
        Model::validateRequired('previewAddress', $this->previewAddress, true);
        Model::validateRequired('fileKey', $this->fileKey, true);
        Model::validateRequired('confirm', $this->confirm, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->templateCode) {
            $res['template_code'] = $this->templateCode;
        }
        if (null !== $this->templateVersion) {
            $res['template_version'] = $this->templateVersion;
        }
        if (null !== $this->previewAddress) {
            $res['preview_address'] = $this->previewAddress;
        }
        if (null !== $this->templateElementList) {
            $res['template_element_list'] = $this->templateElementList;
        }
        if (null !== $this->fileKey) {
            $res['file_key'] = $this->fileKey;
        }
        if (null !== $this->confirm) {
            $res['confirm'] = $this->confirm;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return SaveInnerTemplateRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['tenant_id'])){
            $model->tenantId = $map['tenant_id'];
        }
        if(isset($map['template_code'])){
            $model->templateCode = $map['template_code'];
        }
        if(isset($map['template_version'])){
            $model->templateVersion = $map['template_version'];
        }
        if(isset($map['preview_address'])){
            $model->previewAddress = $map['preview_address'];
        }
        if(isset($map['template_element_list'])){
            $model->templateElementList = $map['template_element_list'];
        }
        if(isset($map['file_key'])){
            $model->fileKey = $map['file_key'];
        }
        if(isset($map['confirm'])){
            $model->confirm = $map['confirm'];
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 商户对应租户ID
    /**
     * @var string
     */
    public $tenantId;

    // 魔法库模板code
    /**
     * @var string
     */
    public $templateCode;

    // 魔法库模板版本
    /**
     * @var string
     */
    public $templateVersion;

    // 文件预览地址
    /**
     * @var string
     */
    public $previewAddress;

    // 创建模板的元素列表
    /**
     * @var string
     */
    public $templateElementList;

    // 文件oss存储的key
    /**
     * @var string
     */
    public $fileKey;

    // 是否确认保存。点击”保存“按钮传false、点击”下一步“按钮传true
    /**
     * @var bool
     */
    public $confirm;

}
