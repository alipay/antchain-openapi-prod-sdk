<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

use AntChain\Deps\Models\BuildpackOS;
use AntChain\Deps\Models\BuildpackRegionRelationDetail;
use AntChain\Deps\Models\Techstack;

class BuildpackAdapter extends Model {
    protected $_name = [
        'buildpackArch' => 'buildpack_arch',
        'fullVersion' => 'full_version',
        'supportedOS' => 'supported_o_s',
        'supportedRegions' => 'supported_regions',
        'techstack' => 'techstack',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->buildpackArch) {
            $res['buildpack_arch'] = $this->buildpackArch;
        }
        if (null !== $this->fullVersion) {
            $res['full_version'] = $this->fullVersion;
        }
        if (null !== $this->supportedOS) {
            $res['supported_o_s'] = [];
            if(null !== $this->supportedOS && is_array($this->supportedOS)){
                $n = 0;
                foreach($this->supportedOS as $item){
                    $res['supported_o_s'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->supportedRegions) {
            $res['supported_regions'] = [];
            if(null !== $this->supportedRegions && is_array($this->supportedRegions)){
                $n = 0;
                foreach($this->supportedRegions as $item){
                    $res['supported_regions'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->techstack) {
            $res['techstack'] = null !== $this->techstack ? $this->techstack->toMap() : null;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return BuildpackAdapter
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['buildpack_arch'])){
            $model->buildpackArch = $map['buildpack_arch'];
        }
        if(isset($map['full_version'])){
            $model->fullVersion = $map['full_version'];
        }
        if(isset($map['supported_o_s'])){
            if(!empty($map['supported_o_s'])){
                $model->supportedOS = [];
                $n = 0;
                foreach($map['supported_o_s'] as $item) {
                    $model->supportedOS[$n++] = null !== $item ? BuildpackOS::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['supported_regions'])){
            if(!empty($map['supported_regions'])){
                $model->supportedRegions = [];
                $n = 0;
                foreach($map['supported_regions'] as $item) {
                    $model->supportedRegions[$n++] = null !== $item ? BuildpackRegionRelationDetail::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['techstack'])){
            $model->techstack = Techstack::fromMap($map['techstack']);
        }
        return $model;
    }
    // buildpackArch
    /**
     * @example buildpackArch
     * @var string
     */
    public $buildpackArch;

    // fullVersion
    /**
     * @example fullVersion
     * @var string
     */
    public $fullVersion;

    // supportedOS
    /**
     * @example 
     * @var BuildpackOS[]
     */
    public $supportedOS;

    // supportedRegions
    /**
     * @example 
     * @var BuildpackRegionRelationDetail[]
     */
    public $supportedRegions;

    // techstack
    /**
     * @example 
     * @var Techstack
     */
    public $techstack;

}
