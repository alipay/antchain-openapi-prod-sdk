<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class CctDetectCheckLabel extends Model
{
    // label
    /**
     * @example label
     *
     * @var string
     */
    public $label;

    // rate
    /**
     * @example rate
     *
     * @var int
     */
    public $rate;

    // subLabels
    /**
     * @example
     *
     * @var CctSubCheckLabel[]
     */
    public $subLabels;

    // details
    /**
     * @example details
     *
     * @var string
     */
    public $details;
    protected $_name = [
        'label'     => 'label',
        'rate'      => 'rate',
        'subLabels' => 'sub_labels',
        'details'   => 'details',
    ];

    public function validate()
    {
        Model::validateRequired('label', $this->label, true);
        Model::validateRequired('rate', $this->rate, true);
        Model::validateRequired('subLabels', $this->subLabels, true);
        Model::validateRequired('details', $this->details, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->label) {
            $res['label'] = $this->label;
        }
        if (null !== $this->rate) {
            $res['rate'] = $this->rate;
        }
        if (null !== $this->subLabels) {
            $res['sub_labels'] = [];
            if (null !== $this->subLabels && \is_array($this->subLabels)) {
                $n = 0;
                foreach ($this->subLabels as $item) {
                    $res['sub_labels'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->details) {
            $res['details'] = $this->details;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CctDetectCheckLabel
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['label'])) {
            $model->label = $map['label'];
        }
        if (isset($map['rate'])) {
            $model->rate = $map['rate'];
        }
        if (isset($map['sub_labels'])) {
            if (!empty($map['sub_labels'])) {
                $model->subLabels = [];
                $n                = 0;
                foreach ($map['sub_labels'] as $item) {
                    $model->subLabels[$n++] = null !== $item ? CctSubCheckLabel::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['details'])) {
            $model->details = $map['details'];
        }

        return $model;
    }
}
