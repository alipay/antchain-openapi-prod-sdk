<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

use AntChain\TWC\Models\ContractPlatformSignField;

class CreateTwcNotaryContractPlatformtemplateRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'regionName' => 'region_name',
        'autoDeduction' => 'auto_deduction',
        'autoDeductionForce' => 'auto_deduction_force',
        'contentMd5' => 'content_md5',
        'contentType' => 'content_type',
        'convert2Pdf' => 'convert2_pdf',
        'fileName' => 'file_name',
        'signFields' => 'sign_fields',
        'userSignPages' => 'user_sign_pages',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->regionName) {
            $res['region_name'] = $this->regionName;
        }
        if (null !== $this->autoDeduction) {
            $res['auto_deduction'] = $this->autoDeduction;
        }
        if (null !== $this->autoDeductionForce) {
            $res['auto_deduction_force'] = $this->autoDeductionForce;
        }
        if (null !== $this->contentMd5) {
            $res['content_md5'] = $this->contentMd5;
        }
        if (null !== $this->contentType) {
            $res['content_type'] = $this->contentType;
        }
        if (null !== $this->convert2Pdf) {
            $res['convert2_pdf'] = $this->convert2Pdf;
        }
        if (null !== $this->fileName) {
            $res['file_name'] = $this->fileName;
        }
        if (null !== $this->signFields) {
            $res['sign_fields'] = [];
            if(null !== $this->signFields && is_array($this->signFields)){
                $n = 0;
                foreach($this->signFields as $item){
                    $res['sign_fields'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->userSignPages) {
            $res['user_sign_pages'] = $this->userSignPages;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CreateTwcNotaryContractPlatformtemplateRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['region_name'])){
            $model->regionName = $map['region_name'];
        }
        if(isset($map['auto_deduction'])){
            $model->autoDeduction = $map['auto_deduction'];
        }
        if(isset($map['auto_deduction_force'])){
            $model->autoDeductionForce = $map['auto_deduction_force'];
        }
        if(isset($map['content_md5'])){
            $model->contentMd5 = $map['content_md5'];
        }
        if(isset($map['content_type'])){
            $model->contentType = $map['content_type'];
        }
        if(isset($map['convert2_pdf'])){
            $model->convert2Pdf = $map['convert2_pdf'];
        }
        if(isset($map['file_name'])){
            $model->fileName = $map['file_name'];
        }
        if(isset($map['sign_fields'])){
            if(!empty($map['sign_fields'])){
                $model->signFields = [];
                $n = 0;
                foreach($map['sign_fields'] as $item) {
                    $model->signFields[$n++] = null !== $item ? ContractPlatformSignField::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['user_sign_pages'])){
            if(!empty($map['user_sign_pages'])){
                $model->userSignPages = $map['user_sign_pages'];
            }
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
    public $productInstanceId;

    /**
     * @var string
     */
    public $regionName;

    // 是否包含代扣规则，如果设置为true，则在创建手动签署流程时，必须传入代扣规则。默认为false
    /**
     * @var bool
     */
    public $autoDeduction;

    // 是否强制用户选择代扣
    /**
     * @var bool
     */
    public $autoDeductionForce;

    // Base64编码的模板文件的MD5值
    /**
     * @var string
     */
    public $contentMd5;

    // 目标文件的MIME类型
    /**
     * @var string
     */
    public $contentType;

    // 是否需要转成pdf，如果模板文件为.doc/.docx 传true，为pdf传false
    /**
     * @var bool
     */
    public $convert2Pdf;

    // 文件名称，必须带扩展名如:.pdf,.doc,.docx
    /**
     * @var string
     */
    public $fileName;

    // 平台方的签署信息列表
    /**
     * @var ContractPlatformSignField[]
     */
    public $signFields;

    // 用户需要签章的页面列表（默认为最后一页）
    /**
     * @var int[]
     */
    public $userSignPages;

}
