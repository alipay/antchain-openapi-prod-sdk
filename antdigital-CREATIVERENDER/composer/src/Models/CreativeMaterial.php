<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\CREATIVERENDER\Models;

use AlibabaCloud\Tea\Model;

class CreativeMaterial extends Model {
    protected $_name = [
        'productCode' => 'product_code',
        'materialId' => 'material_id',
        'materialType' => 'material_type',
        'materialForm' => 'material_form',
        'parentMaterialId' => 'parent_material_id',
        'cover' => 'cover',
        'name' => 'name',
        'fileUrl' => 'file_url',
        'width' => 'width',
        'height' => 'height',
        'fontFamily' => 'font_family',
        'scene' => 'scene',
        'materialUsage' => 'material_usage',
        'industry' => 'industry',
        'publishPlatforms' => 'publish_platforms',
        'materialSizeType' => 'material_size_type',
        'spaceType' => 'space_type',
        'ownerName' => 'owner_name',
        'gmtCreate' => 'gmt_create',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }
        if (null !== $this->materialId) {
            $res['material_id'] = $this->materialId;
        }
        if (null !== $this->materialType) {
            $res['material_type'] = $this->materialType;
        }
        if (null !== $this->materialForm) {
            $res['material_form'] = $this->materialForm;
        }
        if (null !== $this->parentMaterialId) {
            $res['parent_material_id'] = $this->parentMaterialId;
        }
        if (null !== $this->cover) {
            $res['cover'] = $this->cover;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->fileUrl) {
            $res['file_url'] = $this->fileUrl;
        }
        if (null !== $this->width) {
            $res['width'] = $this->width;
        }
        if (null !== $this->height) {
            $res['height'] = $this->height;
        }
        if (null !== $this->fontFamily) {
            $res['font_family'] = $this->fontFamily;
        }
        if (null !== $this->scene) {
            $res['scene'] = $this->scene;
        }
        if (null !== $this->materialUsage) {
            $res['material_usage'] = $this->materialUsage;
        }
        if (null !== $this->industry) {
            $res['industry'] = $this->industry;
        }
        if (null !== $this->publishPlatforms) {
            $res['publish_platforms'] = $this->publishPlatforms;
        }
        if (null !== $this->materialSizeType) {
            $res['material_size_type'] = $this->materialSizeType;
        }
        if (null !== $this->spaceType) {
            $res['space_type'] = $this->spaceType;
        }
        if (null !== $this->ownerName) {
            $res['owner_name'] = $this->ownerName;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CreativeMaterial
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['product_code'])){
            $model->productCode = $map['product_code'];
        }
        if(isset($map['material_id'])){
            $model->materialId = $map['material_id'];
        }
        if(isset($map['material_type'])){
            $model->materialType = $map['material_type'];
        }
        if(isset($map['material_form'])){
            $model->materialForm = $map['material_form'];
        }
        if(isset($map['parent_material_id'])){
            $model->parentMaterialId = $map['parent_material_id'];
        }
        if(isset($map['cover'])){
            $model->cover = $map['cover'];
        }
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['file_url'])){
            $model->fileUrl = $map['file_url'];
        }
        if(isset($map['width'])){
            $model->width = $map['width'];
        }
        if(isset($map['height'])){
            $model->height = $map['height'];
        }
        if(isset($map['font_family'])){
            $model->fontFamily = $map['font_family'];
        }
        if(isset($map['scene'])){
            $model->scene = $map['scene'];
        }
        if(isset($map['material_usage'])){
            $model->materialUsage = $map['material_usage'];
        }
        if(isset($map['industry'])){
            $model->industry = $map['industry'];
        }
        if(isset($map['publish_platforms'])){
            $model->publishPlatforms = $map['publish_platforms'];
        }
        if(isset($map['material_size_type'])){
            $model->materialSizeType = $map['material_size_type'];
        }
        if(isset($map['space_type'])){
            $model->spaceType = $map['space_type'];
        }
        if(isset($map['owner_name'])){
            $model->ownerName = $map['owner_name'];
        }
        if(isset($map['gmt_create'])){
            $model->gmtCreate = $map['gmt_create'];
        }
        return $model;
    }
    // Creative 行业产品代码：FUND / RETAIL，查询时缺省为 RETAIL
    /**
     * @example RETAIL
     * @var string
     */
    public $productCode;

    // 素材ID
    /**
     * @example d55ad74641ce8895ad1321e8b36c4d70
     * @var string
     */
    public $materialId;

    // 素材类型，如 IMAGE / ANIMATION / FONT
    /**
     * @example IMAGE
     * @var string
     */
    public $materialType;

    // 素材形式（SINGLE/PACKAGE）
    /**
     * @example SINGLE
     * @var string
     */
    public $materialForm;

    // 父素材ID
    /**
     * @example c96a7673a96a4178809f6c0f4da40558
     * @var string
     */
    public $parentMaterialId;

    // 是否为封面
    /**
     * @example false
     * @var bool
     */
    public $cover;

    // 素材名称
    /**
     * @example 海报
     * @var string
     */
    public $name;

    // 素材文件URL
    /**
     * @example creative/20260909/sample.jpg
     * @var string
     */
    public $fileUrl;

    // 宽度（像素）
    /**
     * @example 1080
     * @var int
     */
    public $width;

    // 高度（像素）
    /**
     * @example 1920
     * @var int
     */
    public $height;

    // 字体族名（仅 FONT 类型）
    /**
     * @example DEMO_FONT
     * @var string
     */
    public $fontFamily;

    // 使用场景
    /**
     * @example BANNER
     * @var string
     */
    public $scene;

    // 素材用途：REFERENCE_STYLE=参考样式，INPUT_ELEMENT=输入元素
    /**
     * @example REFERENCE_STYLE
     * @var string
     */
    public $materialUsage;

    // RETAIL
    /**
     * @example 行业
     * @var string
     */
    public $industry;

    // 投放平台，多个值使用英文逗号分隔
    /**
     * @example ALIPAY
     * @var string
     */
    public $publishPlatforms;

    // 尺寸类型（16:9、9:16、1:1、4:3、3:4、OTHER）
    /**
     * @example 9:16
     * @var string
     */
    public $materialSizeType;

    // 空间类型：PERSONAL / ENTERPRISE
    /**
     * @example ENTERPRISE
     * @var string
     */
    public $spaceType;

    // 所有者名称
    /**
     * @example name
     * @var string
     */
    public $ownerName;

    // 创建时间，格式 yyyy-MM-dd HH:mm:ss
    /**
     * @example 2026-09-21 12:00:00
     * @var string
     */
    public $gmtCreate;

}
