<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class NotaryFeeEvidTypeData extends Model
{
    // 证据类型描述
    /**
     * @example 网页取证
     *
     * @var string
     */
    public $evidTypeDesc;

    // 证据分类及数量详情
    /**
     * @example 10条，11张截图
     *
     * @var string
     */
    public $evidTypeDetail;
    protected $_name = [
        'evidTypeDesc'   => 'evid_type_desc',
        'evidTypeDetail' => 'evid_type_detail',
    ];

    public function validate()
    {
        Model::validateRequired('evidTypeDesc', $this->evidTypeDesc, true);
        Model::validateRequired('evidTypeDetail', $this->evidTypeDetail, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->evidTypeDesc) {
            $res['evid_type_desc'] = $this->evidTypeDesc;
        }
        if (null !== $this->evidTypeDetail) {
            $res['evid_type_detail'] = $this->evidTypeDetail;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return NotaryFeeEvidTypeData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['evid_type_desc'])) {
            $model->evidTypeDesc = $map['evid_type_desc'];
        }
        if (isset($map['evid_type_detail'])) {
            $model->evidTypeDetail = $map['evid_type_detail'];
        }

        return $model;
    }
}
