<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class CctSubCheckLabel extends Model
{
    // sub_label
    /**
     * @example sub_label
     *
     * @var string
     */
    public $subLabel;

    // rate
    /**
     * @example
     *
     * @var int
     */
    public $rate;
    protected $_name = [
        'subLabel' => 'sub_label',
        'rate'     => 'rate',
    ];

    public function validate()
    {
        Model::validateRequired('subLabel', $this->subLabel, true);
        Model::validateRequired('rate', $this->rate, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->subLabel) {
            $res['sub_label'] = $this->subLabel;
        }
        if (null !== $this->rate) {
            $res['rate'] = $this->rate;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CctSubCheckLabel
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['sub_label'])) {
            $model->subLabel = $map['sub_label'];
        }
        if (isset($map['rate'])) {
            $model->rate = $map['rate'];
        }

        return $model;
    }
}
