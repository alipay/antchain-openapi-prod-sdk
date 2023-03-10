<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AIIDENTIFY\Models;

use AlibabaCloud\Tea\Model;

class IdentifyPointReq extends Model
{
    // 鉴定点名称
    /**
     * @example 产地标
     *
     * @var string
     */
    public $identifyPointName;

    // 鉴定点编号
    /**
     * @example 353gdfgdgge
     *
     * @var string
     */
    public $identifyPointCode;

    // 鉴定商品此鉴定点的图片
    /**
     * @example sdfkjsnjkgk.jpg
     *
     * @var string
     */
    public $identifyPointImg;
    protected $_name = [
        'identifyPointName' => 'identify_point_name',
        'identifyPointCode' => 'identify_point_code',
        'identifyPointImg'  => 'identify_point_img',
    ];

    public function validate()
    {
        Model::validateRequired('identifyPointName', $this->identifyPointName, true);
        Model::validateRequired('identifyPointCode', $this->identifyPointCode, true);
        Model::validateRequired('identifyPointImg', $this->identifyPointImg, true);
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

        return $res;
    }

    /**
     * @param array $map
     *
     * @return IdentifyPointReq
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

        return $model;
    }
}
