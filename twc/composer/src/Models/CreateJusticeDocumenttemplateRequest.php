<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class CreateJusticeDocumenttemplateRequest extends Model
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

    // 文书模板id，如果不为空是修改
    /**
     * @var string
     */
    public $documentTemplateId;

    // 维权要素模板id
    /**
     * @var string
     */
    public $rightProtectTemplateId;

    // 文书模板类型名称，如“仲裁申请书”、“调解协议书”、“起诉状”等
    /**
     * @var string
     */
    public $templateName;

    // 文书生成格式类型，枚举
    // NORMAL：普通文本，
    // RICHTEXT：富文本，
    // PDF：pdf格式文件
    /**
     * @var string
     */
    public $outputType;

    // 传入的模板样式文件格式（目前只支持txt、doc）
    // TXT：txt格式
    // DOC：doc格式
    /**
     * @var string
     */
    public $inputType;

    // 原始模板文件下载地址，如果inputType为DOC则必填
    /**
     * @var string
     */
    public $downloadUrl;

    // 模板数据内容，如果inputType为TXT则必填
    /**
     * @var string
     */
    public $textContent;
    protected $_name = [
        'authToken'              => 'auth_token',
        'productInstanceId'      => 'product_instance_id',
        'documentTemplateId'     => 'document_template_id',
        'rightProtectTemplateId' => 'right_protect_template_id',
        'templateName'           => 'template_name',
        'outputType'             => 'output_type',
        'inputType'              => 'input_type',
        'downloadUrl'            => 'download_url',
        'textContent'            => 'text_content',
    ];

    public function validate()
    {
        Model::validateRequired('rightProtectTemplateId', $this->rightProtectTemplateId, true);
        Model::validateRequired('templateName', $this->templateName, true);
        Model::validateRequired('outputType', $this->outputType, true);
        Model::validateRequired('inputType', $this->inputType, true);
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
        if (null !== $this->documentTemplateId) {
            $res['document_template_id'] = $this->documentTemplateId;
        }
        if (null !== $this->rightProtectTemplateId) {
            $res['right_protect_template_id'] = $this->rightProtectTemplateId;
        }
        if (null !== $this->templateName) {
            $res['template_name'] = $this->templateName;
        }
        if (null !== $this->outputType) {
            $res['output_type'] = $this->outputType;
        }
        if (null !== $this->inputType) {
            $res['input_type'] = $this->inputType;
        }
        if (null !== $this->downloadUrl) {
            $res['download_url'] = $this->downloadUrl;
        }
        if (null !== $this->textContent) {
            $res['text_content'] = $this->textContent;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateJusticeDocumenttemplateRequest
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
        if (isset($map['document_template_id'])) {
            $model->documentTemplateId = $map['document_template_id'];
        }
        if (isset($map['right_protect_template_id'])) {
            $model->rightProtectTemplateId = $map['right_protect_template_id'];
        }
        if (isset($map['template_name'])) {
            $model->templateName = $map['template_name'];
        }
        if (isset($map['output_type'])) {
            $model->outputType = $map['output_type'];
        }
        if (isset($map['input_type'])) {
            $model->inputType = $map['input_type'];
        }
        if (isset($map['download_url'])) {
            $model->downloadUrl = $map['download_url'];
        }
        if (isset($map['text_content'])) {
            $model->textContent = $map['text_content'];
        }

        return $model;
    }
}
