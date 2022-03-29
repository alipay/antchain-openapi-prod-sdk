<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class ConsumerJstackDTO extends Model
{
    // 消费端 Client ID
    /**
     * @example 10.15.232.86@1129e#e4a224f4#2fa8320f33c4#eyIwIjoienRoIn0=
     *
     * @var string
     */
    public $clientId;

    // Jstack 堆栈信息
    /**
     * @example
     *
     * @var ThreadTrackDTO[]
     */
    public $jstack;
    protected $_name = [
        'clientId' => 'client_id',
        'jstack'   => 'jstack',
    ];

    public function validate()
    {
        Model::validateRequired('clientId', $this->clientId, true);
        Model::validateRequired('jstack', $this->jstack, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->clientId) {
            $res['client_id'] = $this->clientId;
        }
        if (null !== $this->jstack) {
            $res['jstack'] = [];
            if (null !== $this->jstack && \is_array($this->jstack)) {
                $n = 0;
                foreach ($this->jstack as $item) {
                    $res['jstack'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ConsumerJstackDTO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['client_id'])) {
            $model->clientId = $map['client_id'];
        }
        if (isset($map['jstack'])) {
            if (!empty($map['jstack'])) {
                $model->jstack = [];
                $n             = 0;
                foreach ($map['jstack'] as $item) {
                    $model->jstack[$n++] = null !== $item ? ThreadTrackDTO::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
