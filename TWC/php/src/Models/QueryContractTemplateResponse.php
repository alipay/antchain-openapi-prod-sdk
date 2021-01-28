<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

use AntChain\TWC\Models\ContractTemplateStructComponent;

class QueryContractTemplateResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'code' => 'code',
        'createTime' => 'create_time',
        'downloadUrl' => 'download_url',
        'fileSize' => 'file_size',
        'message' => 'message',
        'structComponents' => 'struct_components',
        'templateId' => 'template_id',
        'templateName' => 'template_name',
        'updateTime' => 'update_time',
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
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->createTime) {
            $res['create_time'] = $this->createTime;
        }
        if (null !== $this->downloadUrl) {
            $res['download_url'] = $this->downloadUrl;
        }
        if (null !== $this->fileSize) {
            $res['file_size'] = $this->fileSize;
        }
        if (null !== $this->message) {
            $res['message'] = $this->message;
        }
        if (null !== $this->structComponents) {
            $res['struct_components'] = [];
            if(null !== $this->structComponents && is_array($this->structComponents)){
                $n = 0;
                foreach($this->structComponents as $item){
                    $res['struct_components'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->templateId) {
            $res['template_id'] = $this->templateId;
        }
        if (null !== $this->templateName) {
            $res['template_name'] = $this->templateName;
        }
        if (null !== $this->updateTime) {
            $res['update_time'] = $this->updateTime;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryContractTemplateResponse
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
        if(isset($map['code'])){
            $model->code = $map['code'];
        }
        if(isset($map['create_time'])){
            $model->createTime = $map['create_time'];
        }
        if(isset($map['download_url'])){
            $model->downloadUrl = $map['download_url'];
        }
        if(isset($map['file_size'])){
            $model->fileSize = $map['file_size'];
        }
        if(isset($map['message'])){
            $model->message = $map['message'];
        }
        if(isset($map['struct_components'])){
            if(!empty($map['struct_components'])){
                $model->structComponents = [];
                $n = 0;
                foreach($map['struct_components'] as $item) {
                    $model->structComponents[$n++] = null !== $item ? ContractTemplateStructComponent::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['template_id'])){
            $model->templateId = $map['template_id'];
        }
        if(isset($map['template_name'])){
            $model->templateName = $map['template_name'];
        }
        if(isset($map['update_time'])){
            $model->updateTime = $map['update_time'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $reqMsgId;

    /**
     * @var string
     */
    public $resultCode;

    /**
     * @var string
     */
    public $resultMsg;

    // 业务码，0表示成功
    /**
     * @var int
     */
    public $code;

    // 创建时间
    /**
     * @var int
     */
    public $createTime;

    // 模板文件下载地址
    /**
     * @var string
     */
    public $downloadUrl;

    // 模板文件大小
    /**
     * @var int
     */
    public $fileSize;

    // 业务码信息
    /**
     * @var string
     */
    public $message;

    // 文件模板中的输入项组件列表
    /**
     * @var ContractTemplateStructComponent[]
     */
    public $structComponents;

    // 模板id
    /**
     * @var string
     */
    public $templateId;

    // 模板名称
    /**
     * @var string
     */
    public $templateName;

    // 更新时间
    /**
     * @var int
     */
    public $updateTime;

}
