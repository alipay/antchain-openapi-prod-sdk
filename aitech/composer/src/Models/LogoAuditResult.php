<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AITECH\Models;

use AlibabaCloud\Tea\Model;

class LogoAuditResult extends Model
{
    // 检测到LOGO个数
    /**
     * @example
     *
     * @var int
     */
    public $detectNum;

    // LOGO详情
    /**
     * @example
     *
     * @var LogoDetail[]
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
     * @return LogoAuditResult
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
                    $model->details[$n++] = null !== $item ? LogoDetail::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
