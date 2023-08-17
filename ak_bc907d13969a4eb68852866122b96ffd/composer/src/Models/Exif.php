<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_bc907d13969a4eb68852866122b96ffd\Models;

use AlibabaCloud\Tea\Model;

class Exif extends Model
{
    // exif
    /**
     * @example exif
     *
     * @var MapObject[]
     */
    public $exif;
    protected $_name = [
        'exif' => 'exif',
    ];

    public function validate()
    {
        Model::validateRequired('exif', $this->exif, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->exif) {
            $res['exif'] = [];
            if (null !== $this->exif && \is_array($this->exif)) {
                $n = 0;
                foreach ($this->exif as $item) {
                    $res['exif'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Exif
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['exif'])) {
            if (!empty($map['exif'])) {
                $model->exif = [];
                $n           = 0;
                foreach ($map['exif'] as $item) {
                    $model->exif[$n++] = null !== $item ? MapObject::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
