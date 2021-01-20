<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

use AntChain\RMS\Models\FolderPath;

class FolderPaths extends Model {
    protected $_name = [
        'paths' => 'paths',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->paths) {
            $res['paths'] = [];
            if(null !== $this->paths && is_array($this->paths)){
                $n = 0;
                foreach($this->paths as $item){
                    $res['paths'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return FolderPaths
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['paths'])){
            if(!empty($map['paths'])){
                $model->paths = [];
                $n = 0;
                foreach($map['paths'] as $item) {
                    $model->paths[$n++] = null !== $item ? FolderPath::fromMap($item) : $item;
                }
            }
        }
        return $model;
    }
    // paths
    /**
     * @example paths
     * @var FolderPath[]
     */
    public $paths;

}
