<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MYTC\Models;

use AlibabaCloud\Tea\Model;

class PhaseInfo extends Model
{
    // 环节名称
    /**
     * @example 商品信息
     *
     * @var string
     */
    public $name;

    // 环节项
    /**
     * @example
     *
     * @var PhaseItem[]
     */
    public $items;

    // 上传者信息
    /**
     * @example
     *
     * @var UploaderInfo
     */
    public $uploadInfo;

    // 区块信息
    /**
     * @example
     *
     * @var BlockInfo
     */
    public $blockInfo;
    protected $_name = [
        'name'       => 'name',
        'items'      => 'items',
        'uploadInfo' => 'upload_info',
        'blockInfo'  => 'block_info',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('items', $this->items, true);
        Model::validateRequired('uploadInfo', $this->uploadInfo, true);
        Model::validateRequired('blockInfo', $this->blockInfo, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->items) {
            $res['items'] = [];
            if (null !== $this->items && \is_array($this->items)) {
                $n = 0;
                foreach ($this->items as $item) {
                    $res['items'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->uploadInfo) {
            $res['upload_info'] = null !== $this->uploadInfo ? $this->uploadInfo->toMap() : null;
        }
        if (null !== $this->blockInfo) {
            $res['block_info'] = null !== $this->blockInfo ? $this->blockInfo->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PhaseInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['items'])) {
            if (!empty($map['items'])) {
                $model->items = [];
                $n            = 0;
                foreach ($map['items'] as $item) {
                    $model->items[$n++] = null !== $item ? PhaseItem::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['upload_info'])) {
            $model->uploadInfo = UploaderInfo::fromMap($map['upload_info']);
        }
        if (isset($map['block_info'])) {
            $model->blockInfo = BlockInfo::fromMap($map['block_info']);
        }

        return $model;
    }
}
