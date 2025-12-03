<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class UploadDubbridgeAlipayImageRequest extends Model
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

    // request请求单号，每次请求唯一，如uuid
    /**
     * @var string
     */
    public $orderNo;

    // 门店Id
    /**
     * @var string
     */
    public $storeId;

    // 门店所属子品牌，
    // TBJHF: 赛鸽出行-
    // AIJNBJ: 智迈电动车
    // KJOKJBO: 金箭出行
    // IFJRJTIJ: 骑士智行
    // KVMPOH: 巨龙智行
    // NPGBRVBO: 摩生态A
    /**
     * @var string
     */
    public $trafficPlatform;

    // 图片种类，
    // 10: 营业执照
    // 20: 门头照
    // 21: 内景照
    /**
     * @var string
     */
    public $imageCategory;

    // 文件base64字符串，最大10M
    /**
     * @var string
     */
    public $imageContent;

    // 图片文件路径，（建议），http、https为前缀
    /**
     * @var string
     */
    public $imagePath;

    // 图片格式，
    // 支持格式：bmp、jpg、jpeg、png、gif
    /**
     * @var string
     */
    public $imageType;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'orderNo'           => 'order_no',
        'storeId'           => 'store_id',
        'trafficPlatform'   => 'traffic_platform',
        'imageCategory'     => 'image_category',
        'imageContent'      => 'image_content',
        'imagePath'         => 'image_path',
        'imageType'         => 'image_type',
    ];

    public function validate()
    {
        Model::validateRequired('orderNo', $this->orderNo, true);
        Model::validateRequired('storeId', $this->storeId, true);
        Model::validateRequired('trafficPlatform', $this->trafficPlatform, true);
        Model::validateRequired('imageCategory', $this->imageCategory, true);
        Model::validateRequired('imageType', $this->imageType, true);
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
        if (null !== $this->orderNo) {
            $res['order_no'] = $this->orderNo;
        }
        if (null !== $this->storeId) {
            $res['store_id'] = $this->storeId;
        }
        if (null !== $this->trafficPlatform) {
            $res['traffic_platform'] = $this->trafficPlatform;
        }
        if (null !== $this->imageCategory) {
            $res['image_category'] = $this->imageCategory;
        }
        if (null !== $this->imageContent) {
            $res['image_content'] = $this->imageContent;
        }
        if (null !== $this->imagePath) {
            $res['image_path'] = $this->imagePath;
        }
        if (null !== $this->imageType) {
            $res['image_type'] = $this->imageType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UploadDubbridgeAlipayImageRequest
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
        if (isset($map['order_no'])) {
            $model->orderNo = $map['order_no'];
        }
        if (isset($map['store_id'])) {
            $model->storeId = $map['store_id'];
        }
        if (isset($map['traffic_platform'])) {
            $model->trafficPlatform = $map['traffic_platform'];
        }
        if (isset($map['image_category'])) {
            $model->imageCategory = $map['image_category'];
        }
        if (isset($map['image_content'])) {
            $model->imageContent = $map['image_content'];
        }
        if (isset($map['image_path'])) {
            $model->imagePath = $map['image_path'];
        }
        if (isset($map['image_type'])) {
            $model->imageType = $map['image_type'];
        }

        return $model;
    }
}
