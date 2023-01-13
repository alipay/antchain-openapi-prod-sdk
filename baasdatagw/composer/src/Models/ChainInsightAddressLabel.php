<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDATAGW\Models;

use AlibabaCloud\Tea\Model;

class ChainInsightAddressLabel extends Model
{
    // 链上账户或者合约地址
    /**
     * @example 7de3c3db25fe18be036565cec621d7f1a90146467c3f44f118cddfd529e29f8d
     *
     * @var string
     */
    public $address;

    // 账户或者合约的真实名称
    /**
     * @example testaccount1
     *
     * @var string
     */
    public $name;

    // 用户定义的地址描述信息
    /**
     * @example 地址描述信息
     *
     * @var string
     */
    public $comments;

    // 合约/账户地址的标签信息
    /**
     * @example
     *
     * @var MapEntry[]
     */
    public $labels;
    protected $_name = [
        'address'  => 'address',
        'name'     => 'name',
        'comments' => 'comments',
        'labels'   => 'labels',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->address) {
            $res['address'] = $this->address;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->comments) {
            $res['comments'] = $this->comments;
        }
        if (null !== $this->labels) {
            $res['labels'] = [];
            if (null !== $this->labels && \is_array($this->labels)) {
                $n = 0;
                foreach ($this->labels as $item) {
                    $res['labels'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ChainInsightAddressLabel
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['address'])) {
            $model->address = $map['address'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['comments'])) {
            $model->comments = $map['comments'];
        }
        if (isset($map['labels'])) {
            if (!empty($map['labels'])) {
                $model->labels = [];
                $n             = 0;
                foreach ($map['labels'] as $item) {
                    $model->labels[$n++] = null !== $item ? MapEntry::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
