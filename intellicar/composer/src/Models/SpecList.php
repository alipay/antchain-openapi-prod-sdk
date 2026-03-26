<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INTELLICAR\Models;

use AlibabaCloud\Tea\Model;

class SpecList extends Model
{
    // 品牌Id
    /**
     * @example 1
     *
     * @var string
     */
    public $brandId;

    // 品牌名称
    /**
     * @example 宝马
     *
     * @var string
     */
    public $brandName;

    // 厂商id
    /**
     * @example 1
     *
     * @var string
     */
    public $factoryId;

    // 厂商名称
    /**
     * @example 华晨宝马
     *
     * @var string
     */
    public $factoryName;

    // 车系id
    /**
     * @example 100
     *
     * @var string
     */
    public $seriesId;

    // 车系名称
    /**
     * @example 宝马X5
     *
     * @var string
     */
    public $seriesName;

    // 车型Id
    /**
     * @example 1001
     *
     * @var string
     */
    public $specId;

    // 车型名称
    /**
     * @example 2026款 改款 xDrive 40Li M运动曜夜套装
     *
     * @var string
     */
    public $specName;
    protected $_name = [
        'brandId'     => 'brand_id',
        'brandName'   => 'brand_name',
        'factoryId'   => 'factory_id',
        'factoryName' => 'factory_name',
        'seriesId'    => 'series_id',
        'seriesName'  => 'series_name',
        'specId'      => 'spec_id',
        'specName'    => 'spec_name',
    ];

    public function validate()
    {
        Model::validateRequired('brandId', $this->brandId, true);
        Model::validateRequired('brandName', $this->brandName, true);
        Model::validateRequired('factoryId', $this->factoryId, true);
        Model::validateRequired('factoryName', $this->factoryName, true);
        Model::validateRequired('seriesId', $this->seriesId, true);
        Model::validateRequired('seriesName', $this->seriesName, true);
        Model::validateRequired('specId', $this->specId, true);
        Model::validateRequired('specName', $this->specName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->brandId) {
            $res['brand_id'] = $this->brandId;
        }
        if (null !== $this->brandName) {
            $res['brand_name'] = $this->brandName;
        }
        if (null !== $this->factoryId) {
            $res['factory_id'] = $this->factoryId;
        }
        if (null !== $this->factoryName) {
            $res['factory_name'] = $this->factoryName;
        }
        if (null !== $this->seriesId) {
            $res['series_id'] = $this->seriesId;
        }
        if (null !== $this->seriesName) {
            $res['series_name'] = $this->seriesName;
        }
        if (null !== $this->specId) {
            $res['spec_id'] = $this->specId;
        }
        if (null !== $this->specName) {
            $res['spec_name'] = $this->specName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SpecList
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['brand_id'])) {
            $model->brandId = $map['brand_id'];
        }
        if (isset($map['brand_name'])) {
            $model->brandName = $map['brand_name'];
        }
        if (isset($map['factory_id'])) {
            $model->factoryId = $map['factory_id'];
        }
        if (isset($map['factory_name'])) {
            $model->factoryName = $map['factory_name'];
        }
        if (isset($map['series_id'])) {
            $model->seriesId = $map['series_id'];
        }
        if (isset($map['series_name'])) {
            $model->seriesName = $map['series_name'];
        }
        if (isset($map['spec_id'])) {
            $model->specId = $map['spec_id'];
        }
        if (isset($map['spec_name'])) {
            $model->specName = $map['spec_name'];
        }

        return $model;
    }
}
