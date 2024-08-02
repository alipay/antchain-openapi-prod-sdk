<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SDS\Models;

use AlibabaCloud\Tea\Model;

class BatchResult extends Model
{
    // 业务号
    /**
     * @example 业务号
     *
     * @var string
     */
    public $bizNo;

    // 业务号类型
    /**
     * @example PHONE_SHA1
     *
     * @var string
     */
    public $bizNoType;

    // 结果
    /**
     * @example Y
     *
     * @var string
     */
    public $result;
    protected $_name = [
        'bizNo'     => 'biz_no',
        'bizNoType' => 'biz_no_type',
        'result'    => 'result',
    ];

    public function validate()
    {
        Model::validateRequired('bizNo', $this->bizNo, true);
        Model::validateRequired('bizNoType', $this->bizNoType, true);
        Model::validateRequired('result', $this->result, true);
        Model::validateMaxLength('bizNo', $this->bizNo, 64);
        Model::validateMaxLength('bizNoType', $this->bizNoType, 32);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->bizNo) {
            $res['biz_no'] = $this->bizNo;
        }
        if (null !== $this->bizNoType) {
            $res['biz_no_type'] = $this->bizNoType;
        }
        if (null !== $this->result) {
            $res['result'] = $this->result;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BatchResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['biz_no'])) {
            $model->bizNo = $map['biz_no'];
        }
        if (isset($map['biz_no_type'])) {
            $model->bizNoType = $map['biz_no_type'];
        }
        if (isset($map['result'])) {
            $model->result = $map['result'];
        }

        return $model;
    }
}
