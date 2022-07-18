<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class IotBasicDeviceSpecs extends Model
{
    // 厂商编码
    /**
     * @example telpo
     *
     * @var string
     */
    public $corpValue;

    // 厂商名称
    /**
     * @example 天波
     *
     * @var string
     */
    public $corpName;

    // 型号名称
    /**
     * @example TPS1231
     *
     * @var string
     */
    public $modelName;

    // 型号编码
    /**
     * @example TPS123
     *
     * @var string
     */
    public $modelValue;

    // 防疫机
    /**
     * @example 设备品类名称
     *
     * @var string
     */
    public $categoryName;

    // 设备品类编码
    /**
     * @example antmic
     *
     * @var string
     */
    public $categoryCode;

    // 规格ID
    /**
     * @example 12321321
     *
     * @var int
     */
    public $specsId;

    // 规格名称
    /**
     * @example 规格名称
     *
     * @var string
     */
    public $specsName;

    // 规格编码
    /**
     * @example 规格编码
     *
     * @var string
     */
    public $specsValue;

    // 规格参数
    /**
     * @example 规格参数
     *
     * @var string
     */
    public $specsParam;
    protected $_name = [
        'corpValue'    => 'corp_value',
        'corpName'     => 'corp_name',
        'modelName'    => 'model_name',
        'modelValue'   => 'model_value',
        'categoryName' => 'category_name',
        'categoryCode' => 'category_code',
        'specsId'      => 'specs_id',
        'specsName'    => 'specs_name',
        'specsValue'   => 'specs_value',
        'specsParam'   => 'specs_param',
    ];

    public function validate()
    {
        Model::validateRequired('corpValue', $this->corpValue, true);
        Model::validateRequired('corpName', $this->corpName, true);
        Model::validateRequired('modelName', $this->modelName, true);
        Model::validateRequired('modelValue', $this->modelValue, true);
        Model::validateRequired('categoryName', $this->categoryName, true);
        Model::validateRequired('categoryCode', $this->categoryCode, true);
        Model::validateRequired('specsId', $this->specsId, true);
        Model::validateRequired('specsName', $this->specsName, true);
        Model::validateRequired('specsValue', $this->specsValue, true);
        Model::validateRequired('specsParam', $this->specsParam, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->corpValue) {
            $res['corp_value'] = $this->corpValue;
        }
        if (null !== $this->corpName) {
            $res['corp_name'] = $this->corpName;
        }
        if (null !== $this->modelName) {
            $res['model_name'] = $this->modelName;
        }
        if (null !== $this->modelValue) {
            $res['model_value'] = $this->modelValue;
        }
        if (null !== $this->categoryName) {
            $res['category_name'] = $this->categoryName;
        }
        if (null !== $this->categoryCode) {
            $res['category_code'] = $this->categoryCode;
        }
        if (null !== $this->specsId) {
            $res['specs_id'] = $this->specsId;
        }
        if (null !== $this->specsName) {
            $res['specs_name'] = $this->specsName;
        }
        if (null !== $this->specsValue) {
            $res['specs_value'] = $this->specsValue;
        }
        if (null !== $this->specsParam) {
            $res['specs_param'] = $this->specsParam;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return IotBasicDeviceSpecs
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['corp_value'])) {
            $model->corpValue = $map['corp_value'];
        }
        if (isset($map['corp_name'])) {
            $model->corpName = $map['corp_name'];
        }
        if (isset($map['model_name'])) {
            $model->modelName = $map['model_name'];
        }
        if (isset($map['model_value'])) {
            $model->modelValue = $map['model_value'];
        }
        if (isset($map['category_name'])) {
            $model->categoryName = $map['category_name'];
        }
        if (isset($map['category_code'])) {
            $model->categoryCode = $map['category_code'];
        }
        if (isset($map['specs_id'])) {
            $model->specsId = $map['specs_id'];
        }
        if (isset($map['specs_name'])) {
            $model->specsName = $map['specs_name'];
        }
        if (isset($map['specs_value'])) {
            $model->specsValue = $map['specs_value'];
        }
        if (isset($map['specs_param'])) {
            $model->specsParam = $map['specs_param'];
        }

        return $model;
    }
}
