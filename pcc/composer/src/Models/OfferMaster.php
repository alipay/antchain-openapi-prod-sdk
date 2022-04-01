<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PCC\Models;

use AlibabaCloud\Tea\Model;

class OfferMaster extends Model
{
    // 内部商品码
    /**
     * @example baas_pre
     *
     * @var string
     */
    public $innerCode;

    // 用于展示的格式化商品编码
    /**
     * @example PBC0000C013P-R
     *
     * @var string
     */
    public $formatCode;

    // 外部商品编码
    /**
     * @example baas_pre
     *
     * @var string
     */
    public $outerCode;

    // 商品名称
    /**
     * @example 蚂蚁链BaaS平台（包年包月）
     *
     * @var string
     */
    public $name;

    // 商品描述
    /**
     * @example 商品描述
     *
     * @var string
     */
    public $description;

    // 产品code
    /**
     * @example productCode
     *
     * @var string
     */
    public $productCode;

    // 渠道产品编码
    /**
     * @example TWCBAG
     *
     * @var string
     */
    public $serviceCode;

    // l4编码
    /**
     * @example MSRJSPU00000028
     *
     * @var string
     */
    public $spuCode;
    protected $_name = [
        'innerCode'   => 'inner_code',
        'formatCode'  => 'format_code',
        'outerCode'   => 'outer_code',
        'name'        => 'name',
        'description' => 'description',
        'productCode' => 'product_code',
        'serviceCode' => 'service_code',
        'spuCode'     => 'spu_code',
    ];

    public function validate()
    {
        Model::validateRequired('innerCode', $this->innerCode, true);
        Model::validateRequired('formatCode', $this->formatCode, true);
        Model::validateRequired('outerCode', $this->outerCode, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('description', $this->description, true);
        Model::validateRequired('productCode', $this->productCode, true);
        Model::validateRequired('serviceCode', $this->serviceCode, true);
        Model::validateRequired('spuCode', $this->spuCode, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->innerCode) {
            $res['inner_code'] = $this->innerCode;
        }
        if (null !== $this->formatCode) {
            $res['format_code'] = $this->formatCode;
        }
        if (null !== $this->outerCode) {
            $res['outer_code'] = $this->outerCode;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }
        if (null !== $this->serviceCode) {
            $res['service_code'] = $this->serviceCode;
        }
        if (null !== $this->spuCode) {
            $res['spu_code'] = $this->spuCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OfferMaster
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['inner_code'])) {
            $model->innerCode = $map['inner_code'];
        }
        if (isset($map['format_code'])) {
            $model->formatCode = $map['format_code'];
        }
        if (isset($map['outer_code'])) {
            $model->outerCode = $map['outer_code'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['product_code'])) {
            $model->productCode = $map['product_code'];
        }
        if (isset($map['service_code'])) {
            $model->serviceCode = $map['service_code'];
        }
        if (isset($map['spu_code'])) {
            $model->spuCode = $map['spu_code'];
        }

        return $model;
    }
}
