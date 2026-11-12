<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\CORLAB\Models;

use AlibabaCloud\Tea\Model;

use AntChain\CORLAB\Models\TemplateContext;

class ProductExtContext extends Model {
    protected $_name = [
        'productCode' => 'product_code',
        'productName' => 'product_name',
        'templateCode' => 'template_code',
        'templateContext' => 'template_context',
        'scoreFields' => 'score_fields',
        'templateFileDownUrl' => 'template_file_down_url',
    ];
    public function validate() {
        Model::validateRequired('productCode', $this->productCode, true);
        Model::validateRequired('productName', $this->productName, true);
        Model::validateRequired('templateCode', $this->templateCode, true);
        Model::validateRequired('templateContext', $this->templateContext, true);
        Model::validateRequired('scoreFields', $this->scoreFields, true);
        Model::validateRequired('templateFileDownUrl', $this->templateFileDownUrl, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }
        if (null !== $this->productName) {
            $res['product_name'] = $this->productName;
        }
        if (null !== $this->templateCode) {
            $res['template_code'] = $this->templateCode;
        }
        if (null !== $this->templateContext) {
            $res['template_context'] = [];
            if(null !== $this->templateContext && is_array($this->templateContext)){
                $n = 0;
                foreach($this->templateContext as $item){
                    $res['template_context'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->scoreFields) {
            $res['score_fields'] = $this->scoreFields;
        }
        if (null !== $this->templateFileDownUrl) {
            $res['template_file_down_url'] = $this->templateFileDownUrl;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ProductExtContext
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['product_code'])){
            $model->productCode = $map['product_code'];
        }
        if(isset($map['product_name'])){
            $model->productName = $map['product_name'];
        }
        if(isset($map['template_code'])){
            $model->templateCode = $map['template_code'];
        }
        if(isset($map['template_context'])){
            if(!empty($map['template_context'])){
                $model->templateContext = [];
                $n = 0;
                foreach($map['template_context'] as $item) {
                    $model->templateContext[$n++] = null !== $item ? TemplateContext::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['score_fields'])){
            if(!empty($map['score_fields'])){
                $model->scoreFields = $map['score_fields'];
            }
        }
        if(isset($map['template_file_down_url'])){
            $model->templateFileDownUrl = $map['template_file_down_url'];
        }
        return $model;
    }
    // 产品code
    /**
     * @example MD-CpFJeF0DAAABl4MFvUs
     * @var string
     */
    public $productCode;

    // 产品名
    /**
     * @example 小微分
     * @var string
     */
    public $productName;

    // 模版code
    /**
     * @example tb-default
     * @var string
     */
    public $templateCode;

    // 模版内容,数组
    /**
     * @example 
     * @var TemplateContext[]
     */
    public $templateContext;

    // 产品模型结果字段
    /**
     * @example ["aft_v3_score","aft_v4_score"]
     * @var string[]
     */
    public $scoreFields;

    // 返回样本模版文件下载url
    /**
     * @example http://oss
     * @var string
     */
    public $templateFileDownUrl;

}
