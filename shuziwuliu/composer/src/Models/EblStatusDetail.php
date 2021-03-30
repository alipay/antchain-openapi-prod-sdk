<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class EblStatusDetail extends Model
{
    // 当前提单状态
    /**
     * @example endorsed
     *
     * @var string
     */
    public $currentEblStatus;

    // 电子提单编号
    /**
     * @example 暂无
     *
     * @var string
     */
    public $eblNo;

    // 下一个提单状态
    /**
     * @example surrendered
     *
     * @var string
     */
    public $nextEblStatus;
    protected $_name = [
        'currentEblStatus' => 'current_ebl_status',
        'eblNo'            => 'ebl_no',
        'nextEblStatus'    => 'next_ebl_status',
    ];

    public function validate()
    {
        Model::validateRequired('currentEblStatus', $this->currentEblStatus, true);
        Model::validateRequired('eblNo', $this->eblNo, true);
        Model::validateRequired('nextEblStatus', $this->nextEblStatus, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->currentEblStatus) {
            $res['current_ebl_status'] = $this->currentEblStatus;
        }
        if (null !== $this->eblNo) {
            $res['ebl_no'] = $this->eblNo;
        }
        if (null !== $this->nextEblStatus) {
            $res['next_ebl_status'] = $this->nextEblStatus;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return EblStatusDetail
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['current_ebl_status'])) {
            $model->currentEblStatus = $map['current_ebl_status'];
        }
        if (isset($map['ebl_no'])) {
            $model->eblNo = $map['ebl_no'];
        }
        if (isset($map['next_ebl_status'])) {
            $model->nextEblStatus = $map['next_ebl_status'];
        }

        return $model;
    }
}
