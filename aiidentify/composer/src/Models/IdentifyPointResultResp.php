<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AIIDENTIFY\Models;

use AlibabaCloud\Tea\Model;

class IdentifyPointResultResp extends Model
{
    // 234
    /**
     * @example 正面
     *
     * @var string
     */
    public $identifyPointName;

    // 鉴定点唯一编号
    /**
     * @example sklmfj234
     *
     * @var string
     */
    public $identifyPointCode;

    // 鉴定点图片
    /**
     * @example http://34345.jpg
     *
     * @var string
     */
    public $identifyPointImg;

    // 鉴定点的鉴定结果
    // SUCCESS：符合鉴定标准
    // FAILED：不符合鉴定标准
    // NOT_IDENTIFY：无法鉴定
    /**
     * @example SUCCESS
     *
     * @var string
     */
    public $identifyPointResult;
    protected $_name = [
        'identifyPointName'   => 'identify_point_name',
        'identifyPointCode'   => 'identify_point_code',
        'identifyPointImg'    => 'identify_point_img',
        'identifyPointResult' => 'identify_point_result',
    ];

    public function validate()
    {
        Model::validateRequired('identifyPointName', $this->identifyPointName, true);
        Model::validateRequired('identifyPointCode', $this->identifyPointCode, true);
        Model::validateRequired('identifyPointImg', $this->identifyPointImg, true);
        Model::validateRequired('identifyPointResult', $this->identifyPointResult, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->identifyPointName) {
            $res['identify_point_name'] = $this->identifyPointName;
        }
        if (null !== $this->identifyPointCode) {
            $res['identify_point_code'] = $this->identifyPointCode;
        }
        if (null !== $this->identifyPointImg) {
            $res['identify_point_img'] = $this->identifyPointImg;
        }
        if (null !== $this->identifyPointResult) {
            $res['identify_point_result'] = $this->identifyPointResult;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return IdentifyPointResultResp
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['identify_point_name'])) {
            $model->identifyPointName = $map['identify_point_name'];
        }
        if (isset($map['identify_point_code'])) {
            $model->identifyPointCode = $map['identify_point_code'];
        }
        if (isset($map['identify_point_img'])) {
            $model->identifyPointImg = $map['identify_point_img'];
        }
        if (isset($map['identify_point_result'])) {
            $model->identifyPointResult = $map['identify_point_result'];
        }

        return $model;
    }
}
