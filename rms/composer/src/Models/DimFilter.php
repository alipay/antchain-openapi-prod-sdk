<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class DimFilter extends Model
{
    // dim_index
    /**
     * @example dim_index
     *
     * @var int
     */
    public $dimIndex;

    // dim_name
    /**
     * @example dim_name
     *
     * @var string
     */
    public $dimName;

    // white_names
    /**
     * @example white_names
     *
     * @var string[]
     */
    public $whiteNames;

    // black_names
    /**
     * @example black_names
     *
     * @var string[]
     */
    public $blackNames;
    protected $_name = [
        'dimIndex'   => 'dim_index',
        'dimName'    => 'dim_name',
        'whiteNames' => 'white_names',
        'blackNames' => 'black_names',
    ];

    public function validate()
    {
        Model::validateRequired('dimIndex', $this->dimIndex, true);
        Model::validateRequired('dimName', $this->dimName, true);
        Model::validateRequired('whiteNames', $this->whiteNames, true);
        Model::validateRequired('blackNames', $this->blackNames, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->dimIndex) {
            $res['dim_index'] = $this->dimIndex;
        }
        if (null !== $this->dimName) {
            $res['dim_name'] = $this->dimName;
        }
        if (null !== $this->whiteNames) {
            $res['white_names'] = $this->whiteNames;
        }
        if (null !== $this->blackNames) {
            $res['black_names'] = $this->blackNames;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DimFilter
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['dim_index'])) {
            $model->dimIndex = $map['dim_index'];
        }
        if (isset($map['dim_name'])) {
            $model->dimName = $map['dim_name'];
        }
        if (isset($map['white_names'])) {
            if (!empty($map['white_names'])) {
                $model->whiteNames = $map['white_names'];
            }
        }
        if (isset($map['black_names'])) {
            if (!empty($map['black_names'])) {
                $model->blackNames = $map['black_names'];
            }
        }

        return $model;
    }
}
