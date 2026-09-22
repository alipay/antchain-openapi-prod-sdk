<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\CREATIVERENDER\Models;

use AlibabaCloud\Tea\Model;

class QueryAntcloudMarketingagentCreativeMaterialRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'pageNum' => 'page_num',
        'pageSize' => 'page_size',
        'productCode' => 'product_code',
        'spaceType' => 'space_type',
        'materialType' => 'material_type',
        'scene' => 'scene',
        'materialUsage' => 'material_usage',
        'industry' => 'industry',
        'publishPlatforms' => 'publish_platforms',
        'materialSizeType' => 'material_size_type',
        'keyword' => 'keyword',
        'flatten' => 'flatten',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->pageNum) {
            $res['page_num'] = $this->pageNum;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }
        if (null !== $this->spaceType) {
            $res['space_type'] = $this->spaceType;
        }
        if (null !== $this->materialType) {
            $res['material_type'] = $this->materialType;
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
        if (null !== $this->keyword) {
            $res['keyword'] = $this->keyword;
        }
        if (null !== $this->flatten) {
            $res['flatten'] = $this->flatten;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryAntcloudMarketingagentCreativeMaterialRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['page_num'])){
            $model->pageNum = $map['page_num'];
        }
        if(isset($map['page_size'])){
            $model->pageSize = $map['page_size'];
        }
        if(isset($map['product_code'])){
            $model->productCode = $map['product_code'];
        }
        if(isset($map['space_type'])){
            $model->spaceType = $map['space_type'];
        }
        if(isset($map['material_type'])){
            $model->materialType = $map['material_type'];
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
        if(isset($map['keyword'])){
            $model->keyword = $map['keyword'];
        }
        if(isset($map['flatten'])){
            $model->flatten = $map['flatten'];
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 页码，从1开始
    /**
     * @var int
     */
    public $pageNum;

    // 每页条数
    /**
     * @var int
     */
    public $pageSize;

    // Creative 行业产品代码：FUND / RETAIL，查询时缺省为 RETAIL
    /**
     * @var string
     */
    public $productCode;

    // 空间类型：PERSONAL / ENTERPRISE
    /**
     * @var string
     */
    public $spaceType;

    // 素材类型，如 IMAGE / ANIMATION / FONT
    /**
     * @var string
     */
    public $materialType;

    // 使用场景
    /**
     * @var string
     */
    public $scene;

    // 素材用途：REFERENCE_STYLE=参考样式，INPUT_ELEMENT=输入元素
    /**
     * @var string
     */
    public $materialUsage;

    // 行业
    /**
     * @var string
     */
    public $industry;

    // 投放平台，支持多选，多个值使用英文逗号分隔
    /**
     * @var string
     */
    public $publishPlatforms;

    // 尺寸类型（16:9、9:16、1:1、4:3、3:4、OTHER）
    /**
     * @var string
     */
    public $materialSizeType;

    // 搜索关键词
    /**
     * @var string
     */
    public $keyword;

    // 是否平铺展示（true 时展开素材包子素材，不返回素材包父记录）
    /**
     * @var bool
     */
    public $flatten;

}
