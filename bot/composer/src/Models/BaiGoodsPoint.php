<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class BaiGoodsPoint extends Model
{
    // 鉴定点名称
    /**
     * @example 内包装
     *
     * @var string
     */
    public $pointName;

    // 鉴定点子项
    /**
     * @example 正面
     *
     * @var string
     */
    public $subPointName;

    // 鉴定点图片的url
    /**
     * @example https://xxxxxx/a.png
     *
     * @var string
     */
    public $imageUrl;

    // 图片内容base64编码的字符串，该字段与image_url至少一个非空，同时传入以image_url为准
    /**
     * @example /9j/4QyXRXhpZgAATU0AKgAAAAgABwESAAMAAAABAAEAAAEa......
     *
     * @var string
     */
    public $imageBase64;

    // 用户侧鉴定单关联id
    /**
     * @example 100
     *
     * @var string
     */
    public $userPointId;
    protected $_name = [
        'pointName'    => 'point_name',
        'subPointName' => 'sub_point_name',
        'imageUrl'     => 'image_url',
        'imageBase64'  => 'image_base64',
        'userPointId'  => 'user_point_id',
    ];

    public function validate()
    {
        Model::validateRequired('pointName', $this->pointName, true);
        Model::validateRequired('subPointName', $this->subPointName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->pointName) {
            $res['point_name'] = $this->pointName;
        }
        if (null !== $this->subPointName) {
            $res['sub_point_name'] = $this->subPointName;
        }
        if (null !== $this->imageUrl) {
            $res['image_url'] = $this->imageUrl;
        }
        if (null !== $this->imageBase64) {
            $res['image_base64'] = $this->imageBase64;
        }
        if (null !== $this->userPointId) {
            $res['user_point_id'] = $this->userPointId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BaiGoodsPoint
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['point_name'])) {
            $model->pointName = $map['point_name'];
        }
        if (isset($map['sub_point_name'])) {
            $model->subPointName = $map['sub_point_name'];
        }
        if (isset($map['image_url'])) {
            $model->imageUrl = $map['image_url'];
        }
        if (isset($map['image_base64'])) {
            $model->imageBase64 = $map['image_base64'];
        }
        if (isset($map['user_point_id'])) {
            $model->userPointId = $map['user_point_id'];
        }

        return $model;
    }
}
