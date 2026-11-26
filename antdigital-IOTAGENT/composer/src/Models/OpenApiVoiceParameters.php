<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\IOTAGENT\Models;

use AlibabaCloud\Tea\Model;

class OpenApiVoiceParameters extends Model {
    protected $_name = [
        'speed' => 'speed',
        'pitch' => 'pitch',
        'volume' => 'volume',
    ];
    public function validate() {
        Model::validateRequired('speed', $this->speed, true);
        Model::validateRequired('pitch', $this->pitch, true);
        Model::validateRequired('volume', $this->volume, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->speed) {
            $res['speed'] = $this->speed;
        }
        if (null !== $this->pitch) {
            $res['pitch'] = $this->pitch;
        }
        if (null !== $this->volume) {
            $res['volume'] = $this->volume;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return OpenApiVoiceParameters
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['speed'])){
            $model->speed = $map['speed'];
        }
        if(isset($map['pitch'])){
            $model->pitch = $map['pitch'];
        }
        if(isset($map['volume'])){
            $model->volume = $map['volume'];
        }
        return $model;
    }
    // 未确证规范映射/默认为null，不把SDK rate默认当规范已生效
    /**
     * @example undefined
     * @var int
     */
    public $speed;

    // 未确证为null；SDK pitchRate默认1不等于半音0
    /**
     * @example undefined
     * @var int
     */
    public $pitch;

    // Cosyvoice原应用默认100；其他未确证默认null
    /**
     * @example undefined
     * @var int
     */
    public $volume;

}
