<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\CREATIVERENDER\Models;

use AlibabaCloud\Tea\Model;

use AntChain\CREATIVERENDER\Models\MaterialTemplateData;

class PushAntcloudMarketingagentCreativeMaterialResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'materialId' => 'material_id',
        'productCode' => 'product_code',
        'materialType' => 'material_type',
        'materialForm' => 'material_form',
        'name' => 'name',
        'sizeBytes' => 'size_bytes',
        'fileUrl' => 'file_url',
        'templateData' => 'template_data',
        'durationSeconds' => 'duration_seconds',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->materialId) {
            $res['material_id'] = $this->materialId;
        }
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }
        if (null !== $this->materialType) {
            $res['material_type'] = $this->materialType;
        }
        if (null !== $this->materialForm) {
            $res['material_form'] = $this->materialForm;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->sizeBytes) {
            $res['size_bytes'] = $this->sizeBytes;
        }
        if (null !== $this->fileUrl) {
            $res['file_url'] = $this->fileUrl;
        }
        if (null !== $this->templateData) {
            $res['template_data'] = null !== $this->templateData ? $this->templateData->toMap() : null;
        }
        if (null !== $this->durationSeconds) {
            $res['duration_seconds'] = $this->durationSeconds;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return PushAntcloudMarketingagentCreativeMaterialResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['req_msg_id'])){
            $model->reqMsgId = $map['req_msg_id'];
        }
        if(isset($map['result_code'])){
            $model->resultCode = $map['result_code'];
        }
        if(isset($map['result_msg'])){
            $model->resultMsg = $map['result_msg'];
        }
        if(isset($map['material_id'])){
            $model->materialId = $map['material_id'];
        }
        if(isset($map['product_code'])){
            $model->productCode = $map['product_code'];
        }
        if(isset($map['material_type'])){
            $model->materialType = $map['material_type'];
        }
        if(isset($map['material_form'])){
            $model->materialForm = $map['material_form'];
        }
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['size_bytes'])){
            $model->sizeBytes = $map['size_bytes'];
        }
        if(isset($map['file_url'])){
            $model->fileUrl = $map['file_url'];
        }
        if(isset($map['template_data'])){
            $model->templateData = MaterialTemplateData::fromMap($map['template_data']);
        }
        if(isset($map['duration_seconds'])){
            $model->durationSeconds = $map['duration_seconds'];
        }
        return $model;
    }
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    // 素材id
    /**
     * @var string
     */
    public $materialId;

    // 产品码
    /**
     * @var string
     */
    public $productCode;

    // 素材格式类型
    /**
     * @var string
     */
    public $materialType;

    // 素材形式（素材包还是单素材）
    /**
     * @var string
     */
    public $materialForm;

    // 名称
    /**
     * @var string
     */
    public $name;

    // 素材大小
    /**
     * @var int
     */
    public $sizeBytes;

    // 文件url
    /**
     * @var string
     */
    public $fileUrl;

    // 模版元数据
    /**
     * @var MaterialTemplateData
     */
    public $templateData;

    // 时长，单位秒
    /**
     * @var string
     */
    public $durationSeconds;

}
