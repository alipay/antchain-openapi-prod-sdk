<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TDM\Models;

use AlibabaCloud\Tea\Model;

class CertificationInitResponse extends Model
{
    // 核身认证唯一标识
    /**
     * @example cwek23dw24geor89230hf2rw
     *
     * @var string
     */
    public $certifyId;

    // 商户请求唯一标识
    /**
     * @example METL202004041220123456
     *
     * @var string
     */
    public $outerOrderNo;

    // 场景ID
    /**
     * @example 1000048
     *
     * @var string
     */
    public $sceneId;
    protected $_name = [
        'certifyId'    => 'certify_id',
        'outerOrderNo' => 'outer_order_no',
        'sceneId'      => 'scene_id',
    ];

    public function validate()
    {
        Model::validateRequired('certifyId', $this->certifyId, true);
        Model::validateRequired('outerOrderNo', $this->outerOrderNo, true);
        Model::validateRequired('sceneId', $this->sceneId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->certifyId) {
            $res['certify_id'] = $this->certifyId;
        }
        if (null !== $this->outerOrderNo) {
            $res['outer_order_no'] = $this->outerOrderNo;
        }
        if (null !== $this->sceneId) {
            $res['scene_id'] = $this->sceneId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CertificationInitResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['certify_id'])) {
            $model->certifyId = $map['certify_id'];
        }
        if (isset($map['outer_order_no'])) {
            $model->outerOrderNo = $map['outer_order_no'];
        }
        if (isset($map['scene_id'])) {
            $model->sceneId = $map['scene_id'];
        }

        return $model;
    }
}
