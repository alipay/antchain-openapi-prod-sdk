<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AITECH\Models;

use AlibabaCloud\Tea\Model;

class QRCodeAuditResult extends Model
{
    // 检测到二维码个数
    /**
     * @example
     *
     * @var int
     */
    public $detectNum;

    // 二维码详情
    /**
     * @example
     *
     * @var QRCodeDetail[]
     */
    public $details;
    protected $_name = [
        'detectNum' => 'detect_num',
        'details'   => 'details',
    ];

    public function validate()
    {
        Model::validateRequired('detectNum', $this->detectNum, true);
        Model::validateRequired('details', $this->details, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->detectNum) {
            $res['detect_num'] = $this->detectNum;
        }
        if (null !== $this->details) {
            $res['details'] = [];
            if (null !== $this->details && \is_array($this->details)) {
                $n = 0;
                foreach ($this->details as $item) {
                    $res['details'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QRCodeAuditResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['detect_num'])) {
            $model->detectNum = $map['detect_num'];
        }
        if (isset($map['details'])) {
            if (!empty($map['details'])) {
                $model->details = [];
                $n              = 0;
                foreach ($map['details'] as $item) {
                    $model->details[$n++] = null !== $item ? QRCodeDetail::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
