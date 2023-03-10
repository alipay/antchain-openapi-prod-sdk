<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AIIDENTIFY\Models;

use AlibabaCloud\Tea\Model;

class OperateIdentifyRequest extends Model
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

    // 品类名称
    /**
     * @var string
     */
    public $categoryName;

    // 品牌名称
    /**
     * @var string
     */
    public $brandName;

    // 款式名称
    /**
     * @var string
     */
    public $styleName;

    // 款式编号
    /**
     * @var string
     */
    public $styleCode;

    // 鉴定点信息列表
    /**
     * @var IdentifyPointReq[]
     */
    public $identifyPointList;

    // 鉴定点图片列表，当不能提供完整鉴定点信息列表时，可根据鉴定点查询接口出参中order字段将图片直接放入列表中
    /**
     * @var string[]
     */
    public $identifyPointImgList;
    protected $_name = [
        'authToken'            => 'auth_token',
        'productInstanceId'    => 'product_instance_id',
        'categoryName'         => 'category_name',
        'brandName'            => 'brand_name',
        'styleName'            => 'style_name',
        'styleCode'            => 'style_code',
        'identifyPointList'    => 'identify_point_list',
        'identifyPointImgList' => 'identify_point_img_list',
    ];

    public function validate()
    {
        Model::validateRequired('categoryName', $this->categoryName, true);
        Model::validateRequired('brandName', $this->brandName, true);
        Model::validateRequired('styleName', $this->styleName, true);
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
        if (null !== $this->categoryName) {
            $res['category_name'] = $this->categoryName;
        }
        if (null !== $this->brandName) {
            $res['brand_name'] = $this->brandName;
        }
        if (null !== $this->styleName) {
            $res['style_name'] = $this->styleName;
        }
        if (null !== $this->styleCode) {
            $res['style_code'] = $this->styleCode;
        }
        if (null !== $this->identifyPointList) {
            $res['identify_point_list'] = [];
            if (null !== $this->identifyPointList && \is_array($this->identifyPointList)) {
                $n = 0;
                foreach ($this->identifyPointList as $item) {
                    $res['identify_point_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->identifyPointImgList) {
            $res['identify_point_img_list'] = $this->identifyPointImgList;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OperateIdentifyRequest
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
        if (isset($map['category_name'])) {
            $model->categoryName = $map['category_name'];
        }
        if (isset($map['brand_name'])) {
            $model->brandName = $map['brand_name'];
        }
        if (isset($map['style_name'])) {
            $model->styleName = $map['style_name'];
        }
        if (isset($map['style_code'])) {
            $model->styleCode = $map['style_code'];
        }
        if (isset($map['identify_point_list'])) {
            if (!empty($map['identify_point_list'])) {
                $model->identifyPointList = [];
                $n                        = 0;
                foreach ($map['identify_point_list'] as $item) {
                    $model->identifyPointList[$n++] = null !== $item ? IdentifyPointReq::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['identify_point_img_list'])) {
            if (!empty($map['identify_point_img_list'])) {
                $model->identifyPointImgList = $map['identify_point_img_list'];
            }
        }

        return $model;
    }
}
