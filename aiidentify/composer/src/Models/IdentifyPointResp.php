<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AIIDENTIFY\Models;

use AlibabaCloud\Tea\Model;

class IdentifyPointResp extends Model
{
    // 鉴定点名称
    /**
     * @example 外观
     *
     * @var string
     */
    public $identifyPointName;

    // 鉴定点序号
    /**
     * @example 1
     *
     * @var int
     */
    public $order;

    // 鉴定点编号
    /**
     * @example 43jkhjb
     *
     * @var string
     */
    public $identifyPointCode;

    // 标签图片oss链接
    /**
     * @example http://...skfnkj.png
     *
     * @var string
     */
    public $labelImg;

    // 示例图片oss链接
    /**
     * @example http://....sklnkg.png
     *
     * @var string
     */
    public $exampleImg;

    // 是否必传鉴定点
    /**
     * @example true, false
     *
     * @var bool
     */
    public $isRequired;
    protected $_name = [
        'identifyPointName' => 'identify_point_name',
        'order'             => 'order',
        'identifyPointCode' => 'identify_point_code',
        'labelImg'          => 'label_img',
        'exampleImg'        => 'example_img',
        'isRequired'        => 'is_required',
    ];

    public function validate()
    {
        Model::validateRequired('identifyPointName', $this->identifyPointName, true);
        Model::validateRequired('order', $this->order, true);
        Model::validateRequired('identifyPointCode', $this->identifyPointCode, true);
        Model::validateRequired('labelImg', $this->labelImg, true);
        Model::validateRequired('exampleImg', $this->exampleImg, true);
        Model::validateRequired('isRequired', $this->isRequired, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->identifyPointName) {
            $res['identify_point_name'] = $this->identifyPointName;
        }
        if (null !== $this->order) {
            $res['order'] = $this->order;
        }
        if (null !== $this->identifyPointCode) {
            $res['identify_point_code'] = $this->identifyPointCode;
        }
        if (null !== $this->labelImg) {
            $res['label_img'] = $this->labelImg;
        }
        if (null !== $this->exampleImg) {
            $res['example_img'] = $this->exampleImg;
        }
        if (null !== $this->isRequired) {
            $res['is_required'] = $this->isRequired;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return IdentifyPointResp
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['identify_point_name'])) {
            $model->identifyPointName = $map['identify_point_name'];
        }
        if (isset($map['order'])) {
            $model->order = $map['order'];
        }
        if (isset($map['identify_point_code'])) {
            $model->identifyPointCode = $map['identify_point_code'];
        }
        if (isset($map['label_img'])) {
            $model->labelImg = $map['label_img'];
        }
        if (isset($map['example_img'])) {
            $model->exampleImg = $map['example_img'];
        }
        if (isset($map['is_required'])) {
            $model->isRequired = $map['is_required'];
        }

        return $model;
    }
}
