<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_a94beb8f31eb4f8ea9ec901ac99a1aca\Models;

use AlibabaCloud\Tea\Model;

class DogHome extends Model
{
    // 狗狗成员
    /**
     * @example
     *
     * @var Dog[]
     */
    public $dogMembers;

    // 狗狗头目
    /**
     * @example
     *
     * @var Dog
     */
    public $leader;
    protected $_name = [
        'dogMembers' => 'dog_members',
        'leader'     => 'leader',
    ];

    public function validate()
    {
        Model::validateRequired('dogMembers', $this->dogMembers, true);
        Model::validateRequired('leader', $this->leader, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->dogMembers) {
            $res['dog_members'] = [];
            if (null !== $this->dogMembers && \is_array($this->dogMembers)) {
                $n = 0;
                foreach ($this->dogMembers as $item) {
                    $res['dog_members'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->leader) {
            $res['leader'] = null !== $this->leader ? $this->leader->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DogHome
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['dog_members'])) {
            if (!empty($map['dog_members'])) {
                $model->dogMembers = [];
                $n                 = 0;
                foreach ($map['dog_members'] as $item) {
                    $model->dogMembers[$n++] = null !== $item ? Dog::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['leader'])) {
            $model->leader = Dog::fromMap($map['leader']);
        }

        return $model;
    }
}
