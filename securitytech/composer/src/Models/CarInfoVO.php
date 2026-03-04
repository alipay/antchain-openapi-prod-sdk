<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class CarInfoVO extends Model
{
    // 车辆型号
    /**
     * @example E10R
     *
     * @var string
     */
    public $carModel;

    // 车辆颜色
    /**
     * @example 红色
     *
     * @var string
     */
    public $carColor;

    // 车型编号
    /**
     * @example AAA470106
     *
     * @var string
     */
    public $modelNo;

    // 车架号
    /**
     * @example 220922507905000
     *
     * @var string
     */
    public $frameNo;

    // 设备ID
    /**
     * @example FF9999995FF1020251009BE8B1B08855
     *
     * @var string
     */
    public $tuid;

    // tagId
    /**
     * @example 4EA1FFFFFFFFFFFFFFFFFFFFE13D02862257
     *
     * @var string
     */
    public $tagId;

    // 品牌ID
    /**
     * @example SAIGE
     *
     * @var string
     */
    public $brandId;

    // 协议类型
    /**
     * @example ble
     *
     * @var string
     */
    public $protocolType;
    protected $_name = [
        'carModel'     => 'car_model',
        'carColor'     => 'car_color',
        'modelNo'      => 'model_no',
        'frameNo'      => 'frame_no',
        'tuid'         => 'tuid',
        'tagId'        => 'tag_id',
        'brandId'      => 'brand_id',
        'protocolType' => 'protocol_type',
    ];

    public function validate()
    {
        Model::validateRequired('carModel', $this->carModel, true);
        Model::validateRequired('carColor', $this->carColor, true);
        Model::validateRequired('modelNo', $this->modelNo, true);
        Model::validateRequired('frameNo', $this->frameNo, true);
        Model::validateRequired('tuid', $this->tuid, true);
        Model::validateRequired('tagId', $this->tagId, true);
        Model::validateRequired('brandId', $this->brandId, true);
        Model::validateRequired('protocolType', $this->protocolType, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->carModel) {
            $res['car_model'] = $this->carModel;
        }
        if (null !== $this->carColor) {
            $res['car_color'] = $this->carColor;
        }
        if (null !== $this->modelNo) {
            $res['model_no'] = $this->modelNo;
        }
        if (null !== $this->frameNo) {
            $res['frame_no'] = $this->frameNo;
        }
        if (null !== $this->tuid) {
            $res['tuid'] = $this->tuid;
        }
        if (null !== $this->tagId) {
            $res['tag_id'] = $this->tagId;
        }
        if (null !== $this->brandId) {
            $res['brand_id'] = $this->brandId;
        }
        if (null !== $this->protocolType) {
            $res['protocol_type'] = $this->protocolType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CarInfoVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['car_model'])) {
            $model->carModel = $map['car_model'];
        }
        if (isset($map['car_color'])) {
            $model->carColor = $map['car_color'];
        }
        if (isset($map['model_no'])) {
            $model->modelNo = $map['model_no'];
        }
        if (isset($map['frame_no'])) {
            $model->frameNo = $map['frame_no'];
        }
        if (isset($map['tuid'])) {
            $model->tuid = $map['tuid'];
        }
        if (isset($map['tag_id'])) {
            $model->tagId = $map['tag_id'];
        }
        if (isset($map['brand_id'])) {
            $model->brandId = $map['brand_id'];
        }
        if (isset($map['protocol_type'])) {
            $model->protocolType = $map['protocol_type'];
        }

        return $model;
    }
}
